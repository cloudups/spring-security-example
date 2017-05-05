package com.sfq;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MPasswordEncoder implements PasswordEncoder {

	/**
	 * 对密码进行加密并返回
	 */
	public String encode(CharSequence rawPassword) {

		String encPassword = rawPassword.toString();
		return encPassword;
	}

	/**
	 * 验证密码是否正确
	 */
	public boolean matches(CharSequence rawPassword, String encodedPassword) {

		return encode(rawPassword).equals(encodedPassword);
	}
}
