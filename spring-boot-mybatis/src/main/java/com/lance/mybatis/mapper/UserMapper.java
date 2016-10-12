package com.lance.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.lance.mybatis.domain.UserInfo;

@Mapper
public interface UserMapper {
	
	/**
	 * findOne
	 * @param id
	 * @return
	 */
	@Select(value="select *from boot_user where id=#{id}")
	UserInfo findOne(int id);

	@Select(value="select * from boot_user")
	List<UserInfo> test();

	/**
	 * findAll
	 * @return
	 */
	@Select(value="select * from boot_user")
	List<UserInfo> findAll();
}
