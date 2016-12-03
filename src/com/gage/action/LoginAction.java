package com.gage.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by rush on 2016-12-01.
 *
 * 使用session的方法1:
 * HttpServletRequest request = ServletActionContext.getRequest();
 HttpSession session = request.getSession();
 session.setAttribute(LOGINUSER, username);
   使用session的方法2:
 Map usermap = ActionContext.getContext().getSession();
 usermap.put(LOGINUSER, username);
 */
public class LoginAction extends ActionSupport {
    private String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private  String username;

    private String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    //http://www.cnblogs.com/nayitian/p/3439371.html
    @Override
    public String execute(){
        System.out.println("登录:"+getUsername());
        if(getUsername().equals("admin")&&getPassword().equals("123")){

            HttpServletRequest request = ServletActionContext.getRequest();
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            addActionError("I don't know you, dont try to hack me!");
            return SUCCESS;
        }
        return LOGIN;
    }

}
