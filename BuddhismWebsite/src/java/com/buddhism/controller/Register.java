/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.service.administratorService;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Trine
 */
public class Register extends ActionSupport {
    
    private String userName;
    private String password;
    private String passwordAck;
    
    private boolean isTop;
    
    private administratorService service;
    
    private int statue;

    public boolean isIsTop() {
        return isTop;
    }

    public void setIsTop(boolean isTop) {
        this.isTop = isTop;
    }

    public administratorService getService() {
        return service;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
        this.statue = statue;
    }

    public void setService(administratorService service) {
        this.service = service;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordAck() {
        return passwordAck;
    }

    public void setPasswordAck(String passwordAck) {
        this.passwordAck = passwordAck;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public Register() {
    }
    
    @Override
    public String execute() throws Exception {
        
        service.setAdministrator(userName, password, statue,1);
        
        return "SUCCESS";
    }
    
    public String cancel(){ 
        
        return "CANCEL";
    }
    
    @Override
    public void validate()
    {
     if (userName.length() == 0)
         addFieldError("userName", "用户名不能为空");
     if (password.length() == 0)
        addFieldError("password", "密码不能为空");
     if (passwordAck.length() == 0)
        addFieldError("passwordAck", "密码确认不能为空");
     if (!(passwordAck.equals(password)))
         addFieldError("passwordAck", "两次输入的密码不同");
    }
}
