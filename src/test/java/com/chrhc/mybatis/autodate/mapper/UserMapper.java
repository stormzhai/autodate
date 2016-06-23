package com.chrhc.mybatis.autodate.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chrhc.mybatis.autodate.domain.User;

public interface UserMapper {
	

	Integer insertUser(User user);

	Integer insertUserParams(@Param("id")int id, @Param("name")String name,  @Param("password")String password, @Param("version")int version);
	
	Integer insertUserWithDate(User user);
	
	Integer insertBatchUser(List<User> users);
	
	Integer updateVersion(User user);
	
	Integer updateVersionWithDate(User user);
	
	Integer updateBatchVersion(List<User> users);
	
	Integer resetData();
	
}