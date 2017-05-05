package com.sfq;

import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MUserDetails implements UserDetails {
	// 用户名
	private String username;
	// 密码
	private String password;
	// 权限集合
	private Set<MGrantedAuthority> authorities;

	/**
	 * 构造函数
	 * 
	 * @param username
	 * @param password
	 * @param authorities
	 */
	public MUserDetails(String username, String password, Set<MGrantedAuthority> authorities) {

		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	// 账户是否没有过期
	public boolean isAccountNonExpired() {
		return true;
	}

	// 账户是否没有被锁
	public boolean isAccountNonLocked() {
		return true;
	}

	// 资格是否没有过期
	public boolean isCredentialsNonExpired() {
		return true;
	}

	// 该用户信息是否可用
	public boolean isEnabled() {
		return true;
	}
}
