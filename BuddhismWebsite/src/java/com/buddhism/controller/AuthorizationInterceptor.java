/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 *
 * @author GodBlessedMay
 */
public class AuthorizationInterceptor extends AbstractInterceptor{

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        
        ActionContext actionContext = ai.getInvocationContext();
        
        Administrator  user = (Administrator)actionContext.getSession().get("User");
        
        if (user != null)
            return ai.invoke();
        else
            return Action.LOGIN;
    }
    
    
}
