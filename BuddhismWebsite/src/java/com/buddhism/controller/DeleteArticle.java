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
public class DeleteArticle extends ActionSupport {
    
    private int id;
    
    private postService service;
    
    public DeleteArticle() {
    }
    
    public String execute() throws Exception {
        
        service.deletePost(id);
        
        return "SUCCESS";
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
