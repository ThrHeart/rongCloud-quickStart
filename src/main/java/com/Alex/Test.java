package com.Alex;

import com.Alex.model.TokenResult;

public class Test {

	public static void main(String[] args) throws Exception {

		String appKey = "vnroth0kv4y3o";
		String appSecret = "x8nTWVIYoKwepC";
		
		RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret);
				
		// 获取 Token 方法
		TokenResult userGetTokenResult = rongCloud.user.getToken("userId1", "username", "http://www.rongcloud.cn/images/logo.png");
		System.out.println("getToken:  " + userGetTokenResult.toString());

	}

}
