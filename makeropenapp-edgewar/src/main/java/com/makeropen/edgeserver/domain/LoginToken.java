package com.makeropen.edgeserver.domain;

public class LoginToken extends BaseDO {
	private static final long serialVersionUID = 1956112800837912752L;

	private long ownerId;
	private String machineId;
	private String token;

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
