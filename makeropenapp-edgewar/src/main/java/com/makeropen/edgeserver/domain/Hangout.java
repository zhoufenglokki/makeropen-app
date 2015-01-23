package com.makeropen.edgeserver.domain;

import java.util.Map;

public class Hangout extends BaseDO {
	private static final long serialVersionUID = 1165073956054466538L;

	private String name;
	private String desc;
	private String addr;
	private String phone;
	private String geoPoint;
	
	private Map<String, String> photoList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGeoPoint() {
		return geoPoint;
	}

	public void setGeoPoint(String geoPoint) {
		this.geoPoint = geoPoint;
	}

	public Map<String, String> getPhotoList() {
		return photoList;
	}

	public void setPhotoList(Map<String, String> photoList) {
		this.photoList = photoList;
	}
}
