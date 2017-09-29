package com.springboot.test.mybatis;
import java.util.Date;

public class  SystemAdmin{

	private  int  id;

	private  String  loginName;

	private  String  realName;

	private  String  password;

	private  String  encrypt;

	private  String  lastLoginIp;

	private  String  mobile;

	private  String  nackName;

	private  Date  createAt;

	private  Date  updateAt;

	private  int  adminType;

	private  boolean  disabledFlag;

	private  String  mail;

	private  Date  lastLoginTime;

	private  boolean  superFlag;

	private  int  roleId;

	private  int  loginCount;

	private  int  loginError;

	private  String  created;

	private  int  roelId;

	private  String  updated;

	public void setId(int id){
		this.id = id;
	}

	public  int  getId(){
		return	id;
	}
	public void setLoginName(String loginName){
		this.loginName = loginName;
	}

	public  String  getLoginName(){
		return	loginName;
	}
	public void setRealName(String realName){
		this.realName = realName;
	}

	public  String  getRealName(){
		return	realName;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public  String  getPassword(){
		return	password;
	}
	public void setEncrypt(String encrypt){
		this.encrypt = encrypt;
	}

	public  String  getEncrypt(){
		return	encrypt;
	}
	public void setLastLoginIp(String lastLoginIp){
		this.lastLoginIp = lastLoginIp;
	}

	public  String  getLastLoginIp(){
		return	lastLoginIp;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public  String  getMobile(){
		return	mobile;
	}
	public void setNackName(String nackName){
		this.nackName = nackName;
	}

	public  String  getNackName(){
		return	nackName;
	}
	public void setCreateAt(Date createAt){
		this.createAt = createAt;
	}

	public  Date  getCreateAt(){
		return	createAt;
	}
	public void setUpdateAt(Date updateAt){
		this.updateAt = updateAt;
	}

	public  Date  getUpdateAt(){
		return	updateAt;
	}
	public void setAdminType(int adminType){
		this.adminType = adminType;
	}

	public  int  getAdminType(){
		return	adminType;
	}
	public void setDisabledFlag(boolean disabledFlag){
		this.disabledFlag = disabledFlag;
	}

	public  boolean  getDisabledFlag(){
		return	disabledFlag;
	}
	public void setMail(String mail){
		this.mail = mail;
	}

	public  String  getMail(){
		return	mail;
	}
	public void setLastLoginTime(Date lastLoginTime){
		this.lastLoginTime = lastLoginTime;
	}

	public  Date  getLastLoginTime(){
		return	lastLoginTime;
	}
	public void setSuperFlag(boolean superFlag){
		this.superFlag = superFlag;
	}

	public  boolean  getSuperFlag(){
		return	superFlag;
	}
	public void setRoleId(int roleId){
		this.roleId = roleId;
	}

	public  int  getRoleId(){
		return	roleId;
	}
	public void setLoginCount(int loginCount){
		this.loginCount = loginCount;
	}

	public  int  getLoginCount(){
		return	loginCount;
	}
	public void setLoginError(int loginError){
		this.loginError = loginError;
	}

	public  int  getLoginError(){
		return	loginError;
	}
	public void setCreated(String created){
		this.created = created;
	}

	public  String  getCreated(){
		return	created;
	}
	public void setRoelId(int roelId){
		this.roelId = roelId;
	}

	public  int  getRoelId(){
		return	roelId;
	}
	public void setUpdated(String updated){
		this.updated = updated;
	}

	public  String  getUpdated(){
		return	updated;
	}
}