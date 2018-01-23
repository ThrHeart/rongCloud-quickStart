/**
 * 融云 Server API java 客户端
 * create by kitName
 * create datetime : 2017-03-13 
 * 
 * v2.0.1
 */
package com.Alex;

import com.Alex.service.User;

import java.util.concurrent.ConcurrentHashMap;

public class RongCloud {

	private static ConcurrentHashMap<String, RongCloud> rongCloudMap = new ConcurrentHashMap<String,RongCloud>();

	public User user;

	private RongCloud(String appKey, String appSecret) {
		user = new User(appKey, appSecret);
	}

	public static RongCloud getInstance(String appKey, String appSecret) {
		if (null == rongCloudMap.get(appKey)) {
			rongCloudMap.putIfAbsent(appKey, new RongCloud(appKey, appSecret));
		}
		return rongCloudMap.get(appKey);
	}
	 
}