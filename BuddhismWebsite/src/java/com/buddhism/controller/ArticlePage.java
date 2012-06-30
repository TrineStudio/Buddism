package com.buddhism.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.buddhism.model.Post;
import com.buddhism.service.postService;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author GodBlessedMay
 */
public class ArticlePage extends ActionSupport {
    
    private Post post;
    
    private postService service;
    
    private int id;
    
    public ArticlePage() {
    }
    
    public String execute() throws Exception {
        
        post = service.getPost(id);
        
        return "SUCCESS";
    }

    /**
     * @return the post
     */
    public Post getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(Post post) {
        this.post = post;
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
}
