package com.sfq;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MUserDetailsService implements UserDetailsService {

	/**
	 * 根据用户名加载用户密码和权限信息
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO 数据库查询用户信息和数据库信息

		// 模拟构建密码，此处应该数据库查询
		String password = username;
		// 模拟构建权限，此处应该数据库查询
		Set<MGrantedAuthority> authorities = new HashSet<MGrantedAuthority>();
		authorities.add(new MGrantedAuthority("ROLE_USER"));
		authorities.add(new MGrantedAuthority("ROLE_ADMIN"));
		// 构建用户信息
		MUserDetails userDetails = new MUserDetails(username, password, authorities);
		// 返回用户信息
		return userDetails;
	}
}
