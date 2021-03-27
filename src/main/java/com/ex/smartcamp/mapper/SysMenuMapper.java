package com.ex.smartcamp.mapper;

import com.ex.smartcamp.pojo.SysMenu;
import com.ex.smartcamp.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMenuMapper extends MyMapper<SysMenu> {

    List<SysMenu> findByUserName(@Param(value="userName") String userName);
}