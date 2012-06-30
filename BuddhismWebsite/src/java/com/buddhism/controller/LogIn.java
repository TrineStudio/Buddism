/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.service.administratorServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Trine
 */
public class LogIn extends ActionSupport implements SessionAware{
    
    private String userName = null;
    private String password;
    private administratorServiceImpl administratorService;

    private Map session;   
  
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
        Administrator ad = getAdministratorService().getAdministrator(userName);
        
        if(ad != null)
        {
            if(password.equals(ad.getAdPassword()))
            {   
                session.put("User", ad);
                
                return "SUCCESS";
            }
        }
        return "INPUT";
    }


}
