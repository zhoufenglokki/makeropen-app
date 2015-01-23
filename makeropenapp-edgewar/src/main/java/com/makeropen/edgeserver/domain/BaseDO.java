package com.makeropen.edgeserver.domain;

import java.io.Serializable;
import java.time.Instant;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public abstract class BaseDO implements Serializable {
	private static final long serialVersionUID = 725919039510211696L;

	private long id;
	private long flagBit;
	private JSONObject features;
	private Instant createTime;
	private Instant updateTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getFlagBit() {
		return flagBit;
	}

	public void setFlagBit(long flagBit) {
		this.flagBit = flagBit;
	}

	public JSONObject getFeatures() {
		return features;
	}

	public void setFeatures(JSONObject features) {
		this.features = features;
	}

	public Instant getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Instant createTime) {
		this.createTime = createTime;
	}

	public Instant getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Instant updateTime) {
		this.updateTime = updateTime;
	}

	public String toString(){
		return JSON.toJSONString(this);
	}
}
