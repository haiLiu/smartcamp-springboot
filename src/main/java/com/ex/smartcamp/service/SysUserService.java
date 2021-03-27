package com.ex.smartcamp.service;

import com.ex.smartcamp.pojo.SysUser;

import java.util.List;
import java.util.Set;

public interface SysUserService {
    /*
    * 查询所有用户
    * */
    List<SysUser> findAll();

    SysUser findByName(String username);

    /**
     * 查找用户的菜单权限标识集合
     * @param userName
     * @return
     */
    Set<String> findPermissions(String userName);
}
