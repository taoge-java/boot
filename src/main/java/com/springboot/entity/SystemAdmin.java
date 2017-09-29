package com.springboot.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity(name="system_admin")
public class SystemAdmin extends BaseEntity{
	
	@Column(name="login_name")
	private String loginName;
	
	@Column(name="real_name")
	private String realName;
	
	private String encrypt;
	
	@Column(name="last_login_ip")
	private String lastLoginIp;
	
	private String mobile;
	
	@Column(name="nack_name")
	private String nackName;
	
	@Column(name="disabled_flag")
	private boolean disabledFlag;
	
	private String mail;
	
	@Column(name="last_login_time")
	private String lasttLoginTime;
	
	@Column(name="super_flag")
	private boolean superFlag;
	
	@Column(name="role_id")
	private int roleId;
	
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="login_count")
	private int loginCount;
	
	@Column(name="login_error")
	private int loginErrot;
	
	@Column(name="created_at")
    private Date createdAt;
	

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Column(name="updated_at")
	private Date updatedAt;
	
	
	private String created;
	
	private String updated;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getEncrypt() {
		return encrypt;
	}

	public void setEncrypt(String encrypt) {
		this.encrypt = encrypt;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNackName() {
		return nackName;
	}

	public void setNackName(String nackName) {
		this.nackName = nackName;
	}

	public boolean isDisabledFlag() {
		return disabledFlag;
	}

	public void setDisabledFlag(boolean disabledFlag) {
		this.disabledFlag = disabledFlag;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLasttLoginTime() {
		return lasttLoginTime;
	}

	public void setLasttLoginTime(String lasttLoginTime) {
		this.lasttLoginTime = lasttLoginTime;
	}

	public boolean isSuperFlag() {
		return superFlag;
	}

	public void setSuperFlag(boolean superFlag) {
		this.superFlag = superFlag;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	public int getLoginErrot() {
		return loginErrot;
	}

	public void setLoginErrot(int loginErrot) {
		this.loginErrot = loginErrot;
	}
}
