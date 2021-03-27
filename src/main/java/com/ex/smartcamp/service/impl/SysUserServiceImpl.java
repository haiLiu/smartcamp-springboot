package com.ex.smartcamp.service.impl;

import com.ex.smartcamp.mapper.SysUserMapper;
import com.ex.smartcamp.mapper.SysUserRoleMapper;
import com.ex.smartcamp.pojo.SysMenu;
import com.ex.smartcamp.pojo.SysUser;
import com.ex.smartcamp.pojo.SysUserRole;
import com.ex.smartcamp.service.SysMenuService;
import com.ex.smartcamp.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysMenuService sysMenuService;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }

    @Transactional
    @Override
    public int save(SysUser record) {
        String id = null;
        if(record.getId() == null || record.getId().equals("0")) {
            // 新增用户
            sysUserMapper.insertSelective(record);
            id = record.getId();
        } else {
            // 更新用户信息
            sysUserMapper.updateByPrimaryKeySelective(record);
        }
        // 更新用户角色
        if(id != null && record.getId().equals("0")) {
            return 1;
        }
        if(id != null) {
            for(SysUserRole sysUserRole:record.getUserRoles()) {
                sysUserRole.setUserId(id);
            }
        } else {
            sysUserRoleMapper.deleteByPrimaryKey(record.getId());
        }
        for(SysUserRole sysUserRole:record.getUserRoles()) {
            sysUserRoleMapper.insertSelective(sysUserRole);
        }
        return 1;
    }

    @Override
    public SysUser findById(String id){
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public SysUser findByName(String name) {
        Example example = new Example(SysUser.class);
        example.createCriteria().andEqualTo("name", name);
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
