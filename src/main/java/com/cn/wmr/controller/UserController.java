package com.cn.wmr.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.wmr.pojo.Complaint;
import com.cn.wmr.pojo.User;
import com.cn.wmr.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/showUser1")
	public String deleteUser(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		userService.deleteUserById(userId);
		return "showUser";
	}
	
	@RequestMapping("/showUser2")
	public String insertUser(HttpServletRequest request,Model model){
		User record = new User();
		record.id = Integer.parseInt(request.getParameter("id"));
		record.nickname = request.getParameter("nickname");
		record.user_name = request.getParameter("user_name");
		record.password = request.getParameter("password");
		record.sex = request.getParameter("sex");
		record.age = Integer.parseInt(request.getParameter("age"));
		record.id_num = request.getParameter("id_num");
		record.phone = request.getParameter("phone");
		record.email = request.getParameter("email");
		record.address = request.getParameter("address");
		record.love_state = request.getParameter("love_state");
		record.mr_id = Integer.parseInt(request.getParameter("mr_id"));
		record.cpt_times = Integer.parseInt(request.getParameter("cpt_times"));
		userService.insertUser(record);
		return "showUser1";
	}
	
	@RequestMapping("/showUser3")
	public String insertUserSelect(HttpServletRequest request,Model model){
		User record = new User();
		record.id = Integer.parseInt(request.getParameter("id"));
		record.nickname = request.getParameter("nickname");
		record.user_name = request.getParameter("user_name");
		record.password = request.getParameter("password");
		record.sex = request.getParameter("sex");
		record.age = Integer.parseInt(request.getParameter("age"));
		record.id_num = request.getParameter("id_num");
		record.phone = request.getParameter("phone");
		record.email = request.getParameter("email");
		record.address = request.getParameter("address");
		record.love_state = request.getParameter("love_state");
		record.mr_id = Integer.parseInt(request.getParameter("mr_id"));
		record.cpt_times = Integer.parseInt(request.getParameter("cpt_times"));
		userService.insertUserSelect(record);
		return "showUser1";
	}
	
	@RequestMapping("/showUser4")
	public String updateUser(HttpServletRequest request,Model model){
		User record = new User();
		record.id = Integer.parseInt(request.getParameter("id"));
		record.nickname = request.getParameter("nickname");
		record.user_name = request.getParameter("user_name");
		record.password = request.getParameter("password");
		record.sex = request.getParameter("sex");
		record.age = Integer.parseInt(request.getParameter("age"));
		record.id_num = request.getParameter("id_num");
		record.phone = request.getParameter("phone");
		record.email = request.getParameter("email");
		record.address = request.getParameter("address");
		record.love_state = request.getParameter("love_state");
		record.mr_id = Integer.parseInt(request.getParameter("mr_id"));
		record.cpt_times = Integer.parseInt(request.getParameter("cpt_times"));
		userService.updateUserById(record);
		return "showUser1";
	}
	
	@RequestMapping("/showUser5")
	public String updateUserSelect(HttpServletRequest request,Model model){
		User record = new User();
		record.id = Integer.parseInt(request.getParameter("id"));
		record.nickname = request.getParameter("nickname");
		record.user_name = request.getParameter("user_name");
		record.password = request.getParameter("password");
		record.sex = request.getParameter("sex");
		record.age = Integer.parseInt(request.getParameter("age"));
		record.id_num = request.getParameter("id_num");
		System.out.print(request.getParameter("phone"));
		record.phone = request.getParameter("phone");
		record.email = request.getParameter("email");
		record.address = request.getParameter("address");
		record.love_state = request.getParameter("love_state");
		record.mr_id = Integer.parseInt(request.getParameter("mr_id"));
		record.cpt_times = Integer.parseInt(request.getParameter("cpt_times"));
		userService.updateUserSelect(record);
		return "showUser1";
	}
	
	@RequestMapping("/showUser6")
	public String toIndex1(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		Complaint user = this.userService.getUserCmtById(userId);
		model.addAttribute("user", user);
		return "showUser1";
	}
	
}
