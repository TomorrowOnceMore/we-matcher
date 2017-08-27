package com.cn.wmr.pojo;

public class Complaint {
    private Integer id;

    private Integer informant;

	private String cpt_reason;
	
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInformant() {
		return informant;
	}

	public void setInformant(Integer informant) {
		this.informant = informant;
	}

	public String getCpt_reason() {
		return cpt_reason;
	}

	public void setCpt_reason(String cpt_reason) {
		this.cpt_reason = cpt_reason == null ? null : cpt_reason.trim();
	}
}
