package com.cn.wmr.service;

import com.cn.wmr.pojo.Complaint;
import com.cn.wmr.pojo.M_Person;
import com.cn.wmr.pojo.User;
import com.cn.wmr.pojo.User_Rights;
import com.cn.wmr.pojo.User_Status;

public interface IUserService {
	/**
	 * 
	  * @description:用户信息表常用调用数据库接口
	  * @author: chang
	  * @date：2017-8-20 下午6:07:18
	 */
	public User getUserById(int userId);
	public void updateUserById(User record);
	public void updateUserSelect(User record);
	public void insertUser(User record);
	public void insertUserSelect(User record);
	public void deleteUserById(int userId);
	
	/**
	 * 
	  * @description:用户投诉表常用调用数据库接口
	  * @author: chang
	  * @date：2017-8-20 下午6:07:18
	 */
	public Complaint getUserCmtById(int userId);
	public void updateUserCmtById(Complaint record);
	public void updateUserCmtSelect(Complaint record);
	public void insertUserCmt(Complaint record);
	public void insertUserCmtSelect(Complaint record);
	public void deleteUserCmtById(int userId);
	
	/**
	 * 
	  * @description:用户权限表常用调用数据库接口
	  * @author: chang
	  * @date：2017-8-20 下午6:07:18
	 */
	public User_Rights getUserRgtById(int userId);
	public void updateUserRigById(User_Rights record);
	public void updateUserRigSelect(User_Rights record);
	public void insertUserRig(User_Rights record);
	public void insertUserRigSelect(User_Rights record);
	public void deleteUserRigById(int userId);
	
	/**
	 * 
	  * @description:用户状态表常用调用数据库接口
	  * @author: chang
	  * @date：2017-8-20 下午6:07:18
	  * 
	 */
	public User_Status getUserStaById(int userId);
	public void updateUserStaById(User_Status record);
	public void updateUserStaSelect(User_Status record);
	public void insertUserSta(User_Status record);
	public void insertUserStaSelect(User_Status record);
	public void deleteUserStaById(int userId);
	
	/**
	 * 
	  * @description:媒人信息表常用调用数据库接口
	  * @author: chang
	  * @date：2017-8-20 下午6:07:18
	 */
	public M_Person getUserMrById(int userId);
	public void updateUserMrById(M_Person record);
	public void updateUserMrSelect(M_Person record);
	public void insertUserMr(M_Person record);
	public void insertUserMrSelect(M_Person record);
	public void deleteUserMrById(int userId);
}