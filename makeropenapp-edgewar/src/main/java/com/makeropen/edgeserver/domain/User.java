package com.makeropen.edgeserver.domain;

public class User extends BaseDO {
	private static final long serialVersionUID = -3351782838344152487L;

	private String nickname;
	private short status;
	private String passwordMd5AndSalt;
	private String salt;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public String getPasswordMd5AndSalt() {
		return passwordMd5AndSalt;
	}

	public void setPasswordMd5AndSalt(String passwordMd5AndSalt) {
		this.passwordMd5AndSalt = passwordMd5AndSalt;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	public void clearPassword(){
		passwordMd5AndSalt = null;
		salt = null;
	}
}
