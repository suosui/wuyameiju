package com.wuyameiju.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5工具类
 * @author 骆昊
 *
 */
public final class MD5Util {
	private static final char[] hexDigits = { 
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' 
	};

	private static MessageDigest md = null;

	static {
		try {
			md = MessageDigest.getInstance("md5");
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	private MD5Util() {
		throw new AssertionError();
	}

	/**
	 * 加密
	 * @param orginStr 原始字符串
	 * @return 加密后的字符串
	 */
	public static String encode(String orginStr) {
		byte[] result = md.digest(orginStr.getBytes());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			sb.append(hexDigits[(result[i] >> 4) & 0x0f]);
			sb.append(hexDigits[result[i] & 0x0f]);
		}
		return sb.toString();
	}
}
