package com.Alex.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.lang.reflect.Type;

public class GsonUtil {

	private static Gson gson = new GsonBuilder().disableHtmlEscaping().create();

	public static String toJson(Object obj, Type type) {
		return gson.toJson(obj, type);
	}

	public static Object fromJson(String str, Type type) {
		return gson.fromJson(str, type);
	}

}
