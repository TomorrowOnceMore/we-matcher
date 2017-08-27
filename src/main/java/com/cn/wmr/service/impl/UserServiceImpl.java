package com.cn.wmr.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.wmr.dao.ComplaintDao;
import com.cn.wmr.dao.IUserDao;
import com.cn.wmr.dao.IUserRightsDao;
import com.cn.wmr.dao.IUserStatusDao;
import com.cn.wmr.dao.M_PersonDao;
import com.cn.wmr.pojo.Complaint;
import com.cn.wmr.pojo.M_Person;
import com.cn.wmr.pojo.User;
import com.cn.wmr.pojo.User_Rights;
import com.cn.wmr.pojo.User_Status;
import com.cn.wmr.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Resource
	private ComplaintDao complaintDao;
	@Resource
	private IUserRightsDao userRightsDao;
	@Resource
	private IUserStatusDao userStatusDao;
	@Resource
	private M_PersonDao m_PersonDao;
	/**
	 * 用户信息表
	 */
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	@Override
	public void updateUserById(User record) {
		// TODO Auto-generated method stub
		userDao.updateByPrimaryKey(record);
	}
	@Override
	public void insertUser(User record) {
		// TODO Auto-generated method stub
		userDao.insert(record);
	}
	@Override
	public void deleteUserById(int userId) {
		// TODO Auto-generated method stub
		userDao.deleteByPrimaryKey(userId);
	}
	@Override
	public void insertUserSelect(User record) {
		// TODO Auto-generated method stub
		userDao.insertSelective(record);
	}
	@Override
	public void updateUserSelect(User record) {
		// TODO Auto-generated method stub
		userDao.updateByPrimaryKeySelective(record);
	}

	/**
	 * 用户投诉表
	 */
	@Override
	public Complaint getUserCmtById(int userId) {
		// TODO Auto-generated method stub
		return this.complaintDao.selectByPrimaryKey(userId);
	}

	@Override
	public void updateUserCmtById(Complaint record) {
		// TODO Auto-generated method stub
		complaintDao.updateByPrimaryKey(record);
	}

	@Override
	public void updateUserCmtSelect(Complaint record) {
		// TODO Auto-generated method stub
		complaintDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public void insertUserCmt(Complaint record) {
		// TODO Auto-generated method stub
		complaintDao.insert(record);
	}

	@Override
	public void insertUserCmtSelect(Complaint record) {
		// TODO Auto-generated method stub
		complaintDao.insertSelective(record);
	}

	@Override
	public void deleteUserCmtById(int userId) {
		// TODO Auto-generated method stub
		complaintDao.deleteByPrimaryKey(userId);
	}

	/**
	 * 用户权限表
	 */
	@Override
	public User_Rights getUserRgtById(int userId) {
		// TODO Auto-generated method stub
		return this.userRightsDao.selectByPrimaryKey(userId);
	}

	@Override
	public void updateUserRigById(User_Rights record) {
		// TODO Auto-generated method stub
		userRightsDao.updateByPrimaryKey(record); 
	}

	@Override
	public void updateUserRigSelect(User_Rights record) {
		// TODO Auto-generated method stub
		userRightsDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public void insertUserRig(User_Rights record) {
		// TODO Auto-generated method stub
		userRightsDao.insert(record);
	}

	@Override
	public void insertUserRigSelect(User_Rights record) {
		// TODO Auto-generated method stub
		userRightsDao.insertSelective(record);
	}

	@Override
	public void deleteUserRigById(int userId) {
		// TODO Auto-generated method stub
		userRightsDao.deleteByPrimaryKey(userId);
	}

	/**
	 * 用户状态表
	 */
	@Override
	public User_Status getUserStaById(int userId) {
		// TODO Auto-generated method stub
		return this.userStatusDao.selectByPrimaryKey(userId);
	}

	@Override
	public void updateUserStaById(User_Status record) {
		// TODO Auto-generated method stub
		userStatusDao.updateByPrimaryKey(record);
	}

	@Override
	public void updateUserStaSelect(User_Status record) {
		// TODO Auto-generated method stub
		userStatusDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public void insertUserSta(User_Status record) {
		// TODO Auto-generated method stub
		userStatusDao.insert(record);
	}

	@Override
	public void insertUserStaSelect(User_Status record) {
		// TODO Auto-generated method stub
		userStatusDao.insertSelective(record);
	}

	@Override
	public void deleteUserStaById(int userId) {
		// TODO Auto-generated method stub
		userStatusDao.deleteByPrimaryKey(userId);
	}

	/**
	 * 媒人信息表
	 */
	@Override
	public M_Person getUserMrById(int userId) {
		// TODO Auto-generated method stub
		return this.m_PersonDao.selectByPrimaryKey(userId);
	}

	@Override
	public void updateUserMrById(M_Person record) {
		// TODO Auto-generated method stub
		m_PersonDao.updateByPrimaryKey(record);
	}

	@Override
	public void updateUserMrSelect(M_Person record) {
		// TODO Auto-generated method stub
		m_PersonDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public void insertUserMr(M_Person record) {
		// TODO Auto-generated method stub
		m_PersonDao.insert(record);
	}

	@Override
	public void insertUserMrSelect(M_Person record) {
		// TODO Auto-generated method stub
		m_PersonDao.insertSelective(record);
	}

	@Override
	public void deleteUserMrById(int userId) {
		// TODO Auto-generated method stub
		m_PersonDao.deleteByPrimaryKey(userId);
	}

}
