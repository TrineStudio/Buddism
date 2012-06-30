/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Trine
 */
public class LogOut extends ActionSupport implements SessionAware{
    
    private Map session;   
  
    @Override
    public void setSession(Map session) {   
  
       this.session = session;   
    }
    
    @Override
    public String execute()
    {
        session.clear();
        return "SUCCESS";
    }
    
}
