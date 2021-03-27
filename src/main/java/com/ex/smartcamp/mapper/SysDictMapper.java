package com.ex.smartcamp.mapper;

import com.ex.smartcamp.pojo.SysDict;
import com.ex.smartcamp.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDictMapper extends MyMapper<SysDict> {

    List<SysDict> findByLable(@Param(value="label") String label);
}