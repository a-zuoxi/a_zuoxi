package com.wyq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wyq.entity.User;

public interface UserMapper {

	@Select("select * from test01 where uname=#{uname}")
	User findByUname(@Param("uname") String uname);

	@Select("select * from test01")
	List<User> findAll();

	@Insert("insert into test01(uname, pwd, age) values(#{uname},#{pwd},#{age})")
	void insert(User user);
}
