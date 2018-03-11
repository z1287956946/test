package com.ceshi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ceshi.pojo.Members;
@Mapper
public interface MembersDao {
	@Select("select * from  members;")
	List<Members> findMemberBalance();

	
	
}
