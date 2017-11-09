package com.zllh.costing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zllh.costing.dao.UserDao;
import com.zllh.costing.pojo.User;
import com.zllh.costing.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;


	public User getById(int userId) {
		System.out.println(userDao);
		return userDao.selectById(userId);
	}

	@Override
	@Transactional
	public int sdf(User user) {
		System.out.println(user.getUsername());
		User user1 = new User();
		user1.setId(user.getId());
		user1.setUsername("222");
		user1.setAge(10);
		int updateUser = userDao.updateUser(user1);
		System.out.println(updateUser);
		System.out.println(user.getUsername());
		User selUser = userDao.selectById(user.getId());
		System.out.println(selUser.getUsername());
		System.out.println(selUser.getAge());

		User user2 = new User();
		user2.setId(user.getId());
		user2.setAge(1);
		int updateVal = userDao.updateVal(user2);
		User selUser1 = userDao.selectById(user.getId());
		System.out.println(selUser1.getAge());

		return updateUser;
	}
}
