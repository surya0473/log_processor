package com.bt.logprocessor.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Log implements Serializable {

	/**
	 * Log classs used to reprnts log table
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "log_id")
	private Integer logId;

	@Column(name = "name")
	private String name;

	@Column(name = "flag")
	private Boolean flag;

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Log [logId=" + logId + ", name=" + name + ", flag=" + flag + "]";
	}

}
