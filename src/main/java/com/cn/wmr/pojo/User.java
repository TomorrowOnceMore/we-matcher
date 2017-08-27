package com.cn.wmr.pojo;

public class User {
    public Integer id;

    public String nickname;

    public String user_name;
    
    public String password;

    public String sex;
    
    public Integer age;

    public String id_num;

    public String phone;

    public String email;
    
    public String address;

    public String love_state;

    public Integer mr_id;

    public Integer cpt_times;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name == null ? null : user_name.trim();
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getId_num() {
		return id_num;
	}

	public void setId_num(String id_num) {
		this.id_num = id_num == null ? null : id_num.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getLove_state() {
		return love_state;
	}

	public void setLove_state(String love_state) {
		this.love_state = love_state == null ? null : love_state.trim();
	}

	public Integer getMr_id() {
		return mr_id;
	}

	public void setMr_id(Integer mr_id) {
		this.mr_id = mr_id;
	}

	public Integer getCpt_times() {
		return cpt_times;
	}

	public void setCpt_times(Integer cpt_times) {
		this.cpt_times = cpt_times;
	}

}