/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.service.administratorServiceImpl;
import com.buddhism.service.postService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Trine
 */
public class LogIn extends ActionSupport implements SessionAware{
    
    private String userName = null;
    private String password;
    private administratorServiceImpl administratorService;
    
    private postService pService;

    private Map session;   

    public postService getpService() {
        return pService;
    }

    public void setpService(postService pService) {
        this.pService = pService;
    }    
  
    @Override
    public void setSession(Map session) {   
  
       this.session = session;   
  
  
    }    
   
    public administratorServiceImpl getAdministratorService() {
        return administratorService;
    }

    public void setAdministratorService(administratorServiceImpl administratorService) {
        this.administratorService = administratorService;
    }
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String execute()
    {
        if (userName == null)
            return "INPUT";
        String test = userName;
        
        int result = getAdministratorService().loginCheck(userName, password);
        
        if (result != 3)
            return "INPUT";
        
        Administrator ad = getAdministratorService().getAdministrator();
        
        if(ad != null)
        {
                session.put("User", ad);
                
                return "SUCCESS";
        }
        return "INPUT";
    }


}
