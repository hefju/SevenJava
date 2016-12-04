package com.gage.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
//        //if(getUsername().equals("admin")&&getPassword().equals("123")){
//        if(getUsername().equals("admin"))
//        {
//            HttpServletRequest request = ServletActionContext.getRequest();
//            HttpSession session = request.getSession();
//            System.out.println("sessionID:" + session.getId());
//            session.setAttribute("username", getUsername());
//            session.setAttribute("password", getPassword());
//
////        ActionContext actionContext = ActionContext.getContext(); //取到struts容器
////        Map session = actionContext.getSession(); //取得session
////        session.put("username", getUsername()); //把用户数据放入session
////        session.put("password",getPassword()); //把用户数据放入session
//
//            return SUCCESS;
//        }
//        else
//        {
//            return LOGIN;
//        }
        return login();
    }

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /** 用户登陆 */
    public String login() {
        String username=getUsername();
        if(StringUtils.isBlank(username)) {
            return Action.LOGIN;
        }
        /*
                这里写你自己通过用户名查找用户信息的业务逻辑
                  比如：使用手机号登陆
        Citizen user = prmService.queryEGovCitizenByMobile(this.loginname);
        ....
        */
        //if(user == null || user.getPwd() == null || !user.getPwd().getValue().equals(this.password)) {
        if(!username.equals("admin")&&!username.equals("hefju")){
            //登陆失败
            //this.msg = "用户不存在或密码错误！";
            setMsg("用户不存在或密码错误！");
            System.out.println("用户不存在或密码错误！");
            return Action.LOGIN;//INPUT
        } else {
            //登陆成功
            //设置session
            this.getSession().setAttribute("username", username);//_USER_INFO_LOGIN_NAME_
            this.getSession().setAttribute("password", getPassword());//_USER_INFO_Password_
//            this.getSession().setAttribute("_USER_INFO_USER_ID_", user.getId().getValue());
//            this.getSession().setAttribute("_USER_INFO_USER_INFO_", user);
            //设置cookie
//            this.getResponse().addCookie(new Cookie("_USER_INFO_LOGIN_NAME_", this.loginname));
//            this.getResponse().addCookie(new Cookie("_USER_INFO_USER_ID_", user.getId().getValue()));
            return Action.SUCCESS;
        }
    }

    /**
     * 注销
     */
    public String loginout() {

        String sid=this.getSession().getId();
        System.out.println("sessionID:"+sid+" 清空!");
        //清空session
        this.getSession().invalidate();
        return Action.SUCCESS;
    }
    //显示当前登录用户的信息
    public String ShowLoginInfo()
    {
        HttpSession session=getSession();
        String sid=session.getId();
        String username=(String)session.getAttribute("username");
        String password=(String)session.getAttribute("password");
        System.out.println("name:"+username+" pwd:"+password+" sid:"+sid);
        return SUCCESS;
    }

    public HttpSession getSession() {
        return ServletActionContext.getRequest().getSession();
    }

    public HttpServletRequest getRequest() {
        return ServletActionContext.getRequest();
    }

    public HttpServletResponse getResponse() {
        return ServletActionContext.getResponse();
    }

}
