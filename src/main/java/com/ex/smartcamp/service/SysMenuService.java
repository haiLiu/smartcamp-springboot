package com.ex.smartcamp.service;

import java.util.List;

import com.ex.smartcamp.pojo.SysMenu;

/**
 * 菜单管理
 */
public interface SysMenuService {

	/**
	 * 根据用户名查找菜单列表
	 * @param userName
	 * @return
	 */
	List<SysMenu> findByUser(String userName);
}
