package com.imooc.demo2;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.imooc.utils.SSOCheck;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Demo2Actio类
 *
 */
public class Demo2Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8244417645140706122L;

	private String gotoUrl;

	public String main() {
		HttpServletRequest request = ServletActionContext.getRequest();
		if (SSOCheck.checkCookie(request)) {
			return SUCCESS;
		}
		gotoUrl = "/demo2/main.action";
		return LOGIN;
	}

	public String getGotoUrl() {
		return gotoUrl;
	}

	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

}
