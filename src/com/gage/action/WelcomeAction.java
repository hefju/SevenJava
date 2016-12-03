package com.gage.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * Created by rush on 2016-12-01.
 */
public class WelcomeAction extends ActionSupport {
    @Override
    public String execute(){
        System.out.println("进入WelcomeAction控制器");

        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
//  if(session.getAttribute("userinfo") == null) {

            System.out.println("WelcomeAction:"+session.getAttribute("username"));

            return SUCCESS;
    }
}
