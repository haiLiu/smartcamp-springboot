package com.ex.smartcamp.service.impl;

import java.util.List;

import com.ex.smartcamp.constant.SysConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.smartcamp.mapper.SysMenuMapper;
import com.ex.smartcamp.pojo.SysMenu;
import com.ex.smartcamp.service.SysMenuService;
import tk.mybatis.mapper.entity.Example;

@Service
public class SysMenuServiceImpl implements SysMenuService {

	@Autowired
	private SysMenuMapper sysMenuMapper;


	@Override
	public List<SysMenu> findByUser(String userName) {
		if(userName == null || "".equals(userName) || SysConstants.ADMIN.equalsIgnoreCase(userName)) {
			return sysMenuMapper.selectAll();
		}
//		return sysMenuMapper.findByUserName(userName);
	}


}
