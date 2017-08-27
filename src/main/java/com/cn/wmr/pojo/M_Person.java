package com.cn.wmr.pojo;

public class M_Person {
    private Integer id;

    private String mr_name;

    private String mr_sex;

    private String mr_phone;

	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMr_name() {
		return mr_name;
	}

	public void setMr_name(String mr_name) {
		this.mr_name = mr_name == null ? null : mr_name.trim();
	}

	public String getMr_sex() {
		return mr_sex;
	}

	public void setMr_sex(String mr_sex) {
		this.mr_sex = mr_sex == null ? null : mr_sex.trim();
	}

	public String getMr_phone() {
		return mr_phone;
	}

	public void setMr_phone(String mr_phone) {
		this.mr_phone = mr_phone == null ? null : mr_phone.trim();
	}
	
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}
}
