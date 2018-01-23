package com.Alex.util;

public enum HostType {
	API("http://api.cn.ronghub.com"), SMS("http://api.sms.ronghub.com");
	private String type;

	HostType(String type) {
		this.type = type;
	}

	public static HostType getType(String state) {
		for (HostType deviceType : HostType.values()) {
			if (deviceType.type.equalsIgnoreCase(state)) {
				return deviceType;
			}
		}
		throw new RuntimeException(state + " is not a valid Host Type!");
	}

	public String getType() {
		return type;
	}
}