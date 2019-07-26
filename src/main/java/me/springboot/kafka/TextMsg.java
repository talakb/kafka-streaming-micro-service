package me.springboot.kafka;

import java.sql.Timestamp;

public class TextMsg {
	private String msg;
	private Timestamp sentTs;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Timestamp getSentTs() {
		return sentTs;
	}

	public void setSentTs(Timestamp sentTs) {
		this.sentTs = sentTs;
	}
}
