package com.ex.smartcamp.service.impl;

import com.ex.smartcamp.mapper.SysUserMapper;
import com.ex.smartcamp.pojo.SysMenu;
import com.ex.smartcamp.pojo.SysUser;
import com.ex.smartcamp.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }

    @Override
    public SysUser findByName(String name) {
        Example example = new Example(SysUser.class);
        example.createCriteria().andEqualTo("username", name);
        return sysUserMapper.selectOneByExample(example);
    }

    @Override
    public Set<String> findPermissions(String userName) {
        Set<String> perms = new HashSet<>();
        List<SysMenu> sysMenus = sysMenuService.findByUser(userName);
        for(SysMenu sysMenu:sysMenus) {
            if(sysMenu.getPerms() != null && !"".equals(sysMenu.getPerms())) {
                perms.add(sysMenu.getPerms());
            }
        }
        return perms;
    }
}
