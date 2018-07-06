package com.imooc.demo1;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

import com.imooc.utils.SSOCheck;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Demo1Action类
 */
public class Demo1Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8701519089633911575L;

	private String gotoUrl;

	public String main() {

		HttpServletRequest request = ServletActionContext.getRequest();
		if (SSOCheck.checkCookie(request)) {
			return SUCCESS;
			
		}
		gotoUrl = "/demo1/main.action";
		return LOGIN;
	}

	public String getGotoUrl() {
		return gotoUrl;
	}

	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

}
