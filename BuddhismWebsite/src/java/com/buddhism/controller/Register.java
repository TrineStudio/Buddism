/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.User;
import com.buddhism.service.administratorService;
import com.buddhism.tool.SHA1;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Trine
 */
public class Register extends ActionSupport {
    
    private String userName;
    private String password;
    private String passwordAck;
    
    private int userTypeId;
    
    private List<User> users = new ArrayList<User>();
    
    
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
    
    public String register(){
        
        if (!password.equals(passwordAck))
            return "INPUT";

        String randString = SHA1.generateSalt();
        String passWord = SHA1.generatePasswordInDatabase(password, randString);
        
        this.getService().setAdministrator(userName, passWord, userTypeId, randString);
        
        return "REGISTER";
    }
    
    @Override
    public String execute() throws Exception {
        
        users.clear();
        
        users.add(new User(0, "超级管理员"));
        users.add(new User(1, "管理员"));
        
        return "SUCCESS";
    }
    
    public String cancel(){ 
        
        return "CANCEL";
    }

    /**
     * @return the users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * @return the userTypeId
     */
    public int getUserTypeId() {
        return userTypeId;
    }

    /**
     * @param userTypeId the userTypeId to set
     */
    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }
}
