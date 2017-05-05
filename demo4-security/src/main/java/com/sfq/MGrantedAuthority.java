package com.sfq;

import org.springframework.security.core.GrantedAuthority;

public class MGrantedAuthority implements GrantedAuthority {

	// 权限信息
	private String authority;

	/**
	 * 构造函数
	 * 
	 * @param authority
	 */
	public MGrantedAuthority(String authority) {
		this.authority = authority;
	}

	/**
	 * 获取权限信息
	 */
	public String getAuthority() {
		return authority;
	}
}
