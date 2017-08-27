package com.cn.wmr.pojo;

public class User_Status {
    private Integer id;

    private String love;

    private String be_loved;

    private String date_status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}

	public String getBe_loved() {
		return be_loved;
	}

	public void setBe_loved(String be_loved) {
		this.be_loved = be_loved;
	}

	public String getDate_status() {
		return date_status;
	}

	public void setDate_status(String date_status) {
	    this.date_status = date_status == null ? null : date_status.trim();
	}
}
