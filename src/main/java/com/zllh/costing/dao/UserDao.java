package com.zllh.costing.dao;

import com.zllh.costing.pojo.User;


public interface UserDao {

	User selectById(int userId);
	
	int updateUser(User user);
	
	int updateVal(User user);

}
