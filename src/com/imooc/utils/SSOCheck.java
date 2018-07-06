package com.imooc.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class SSOCheck {
	public static final String username = "user";
	
	public static final String passsword = "123456";
	/**
	 * 校验登录校验（对用户名和密码的校验）
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean checkLogin(String username, String password) {
		if(username.equals(username) && password.equals(password)) {
			return true;
		}
		return false;
		
	}
	
	/**
	 * 编写校验接口（对cookie的校验）
	 * @param request
	 * @return
	 */
	public static boolean checkCookie(HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals("ssocookie") 
						&& cookie.getValue().equals("sso")) {
					return true;
				}
			}
		}
		return false;
	} 
}
