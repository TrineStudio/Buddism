/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.service.postService;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author GodBlessedMay
 */
public class GetPostByType extends ActionSupport {
    
    private int type;
    private postService service;
    
    
    public GetPostByType() {
    }
    
    public String execute() throws Exception {
        return "SUCCESS";
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the service
     */
    public postService getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(postService service) {
        this.service = service;
    }
}
