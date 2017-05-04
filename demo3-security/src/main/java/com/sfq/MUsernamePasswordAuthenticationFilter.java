package com.sfq;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class MUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		for (Object key : req.getParameterMap().keySet()) {
			System.out.println(key + ", " + req.getParameter(key.toString()));
		}

		super.doFilter(req, res, chain);
	}
}
