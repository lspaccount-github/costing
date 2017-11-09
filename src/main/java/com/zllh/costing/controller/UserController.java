package com.zllh.costing.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zllh.costing.pojo.User;
import com.zllh.costing.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	private int bb;

	@RequestMapping(value="/getUser")
	public String getUsers(ModelMap modelMap,HttpServletRequest request,HttpServletResponse response){
		User user = userService.getById(1);
		int aa = userService.sdf(user);
		System.out.println(user.toString());
		System.out.println(user.toString());
		System.out.println(user.toString());
		System.out.println(user.toString());
		System.out.println(user.toString());
		System.out.println("同步到github");

		return "userList";
	}

    /**
     * 
     * @param modelMap
     * @param request
     * @param response
     * @return
     */
	@RequestMapping(value="/updateUser")
	public String updateUser(ModelMap modelMap,HttpServletRequest request,HttpServletResponse response){
	    User user = userService.getById(1);
        int update = userService.sdf(user);
        System.out.println(update);
        return "userList";
	}
}
