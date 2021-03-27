package com.ex.smartcamp.service;

import java.util.List;

import com.ex.smartcamp.pojo.SysDict;
import com.ex.smartcamp.utils.PageRequest;
import com.ex.smartcamp.utils.PageResult;

/**
 * 字典管理
 */
public interface SysDictService {

	public int save(SysDict record);

	public int delete(SysDict record);

	public int delete(List<SysDict> records);

	public SysDict findById(Long id);

	public PageResult findPage(PageRequest pageRequest);

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
