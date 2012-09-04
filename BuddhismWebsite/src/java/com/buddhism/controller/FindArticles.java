/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Post;
import com.buddhism.service.postService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Administrator
 */
public class FindArticles implements SessionAware{
    
    protected Map session;
    
    protected List<Post> posts;
    
    protected String keyWords;
    
    protected postService service;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public postService getService() {
        return service;
    }

    public void setService(postService service) {
        this.service = service;
    }                
    
    @Override
    public void setSession(Map session) {     
       this.session = session;      
    }      
    
    public String execute()
    {
        posts = new ArrayList<Post>();
        
        posts = service.getPostNameLike(keyWords);
        
        return "SUCCESS";
    }
    
}
