package com.ex.smartcamp.controller;

import com.ex.smartcamp.constant.SysConstants;
import com.ex.smartcamp.pojo.SysUser;
import com.ex.smartcamp.service.SysUserService;
import com.ex.smartcamp.utils.HttpResult;
import com.ex.smartcamp.utils.PasswordUtils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private Sid sid;

    @PreAuthorize("hasAuthority('sys:user:add') AND hasAuthority('sys:user:edit')")
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody SysUser record) {
        SysUser user = sysUserService.findById(record.getId());
        if(user != null) {
            if(SysConstants.ADMIN.equalsIgnoreCase(user.getName())) {
                return HttpResult.error("超级管理员不允许修改!");
            }
        }
        if(record.getPassword() != null) {
            String salt = PasswordUtils.getSalt();
            if(user == null) {
                // 新增用户
                if(sysUserService.findByName(record.getName()) != null) {
                    return HttpResult.error("用户名已存在!");
                }
                String password = PasswordUtils.encode(record.getPassword(), salt);
                record.setSalt(salt);
                record.setPassword(password);
            } else {
                // 修改用户, 且修改了密码
                if(!record.getPassword().equals(user.getPassword())) {
                    String password = PasswordUtils.encode(record.getPassword(), salt);
                    record.setSalt(salt);
                    record.setPassword(password);
                }
            }
        }
        return HttpResult.ok(sysUserService.save(record));
    }

    @PostMapping(value="/register")
    public HttpResult register(@RequestBody SysUser record) {
        if(record.getPassword() != null) {
            String salt = PasswordUtils.getSalt();
            // 新增用户
            if(sysUserService.findByName(record.getName()) != null) {
                    return HttpResult.error("用户名已存在!");
            }
            String password = PasswordUtils.encode(record.getPassword(), salt);
            record.setSalt(salt);
            record.setPassword(password);
            record.setId(sid.nextShort());
            return HttpResult.ok(sysUserService.insert(record));
        }
        return  HttpResult.error("密码不允许为空！");
    }

    @GetMapping(value="/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }
}
