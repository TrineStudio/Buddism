/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Constants;
import com.buddhism.model.Post;
import com.buddhism.service.postService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;



 
public class MainPageAction implements SessionAware
{
    private List<Post> informs = new ArrayList<Post>();
    private List<Post> lastestMessage = new ArrayList<Post>();
    private List<Post> buddleWords = new ArrayList<Post>();
    private List<Post> temples = new ArrayList<Post>();
    private List<Post> shares = new ArrayList<Post>();
    private List<Post> posts = new ArrayList<Post>();
    private List<Post> supports = new ArrayList<Post>();

    private int count;
    
    private postService service;

    
    private Map session;   
  
    @Override
    public void setSession(Map session) {   
  
       this.session = session;   
  
  
    }    
    
    public List<Post> getBuddleWords() {
        return buddleWords;
    }

    public void setBuddleWords(List<Post> buddleWords) {
        this.buddleWords = buddleWords;
    }

    public List<Post> getInforms() {
        return informs;
    }

    public void setInforms(List<Post> informs) {
        this.informs = informs;
    }
    
    public postService getService() {
        return service;
    }

    public void setService(postService service) {
        this.service = service;
    }
    
    public void putSession()
    {
        session.put("informs", informs);
        session.put("messages", lastestMessage);
        session.put("supports", supports);
    }

    public String execute(){
    
        getSession().remove("pictures");
        
        informs = service.getPost((short)Constants.informs, 0, 5);
        buddleWords = service.getPost((short)Constants.buddleWords, 0, 5);
        lastestMessage = service.getPost((short)Constants.lastestNews, 0, 5);
        temples = service.getPost((short)Constants.temples, 0, 5);
        shares = service.getPost((short)Constants.shares, 0, 5);
        supports = service.getPost((short)Constants.supports, 0, 5);
        
        putSession();
        
 
        return "SUCCESS";
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return the lastestMessage
     */
    public List<Post> getLastestMessage() {
        return lastestMessage;
    }

    /**
     * @param lastestMessage the lastestMessage to set
     */
    public void setLastestMessage(List<Post> lastestMessage) {
        this.lastestMessage = lastestMessage;
    }

    /**
     * @return the temples
     */
    public List<Post> getTemples() {
        return temples;
    }

    /**
     * @param temples the temples to set
     */
    public void setTemples(List<Post> temples) {
        this.temples = temples;
    }

    /**
     * @return the shares
     */
    public List<Post> getShares() {
        return shares;
    }

    /**
     * @param shares the shares to set
     */
    public void setShares(List<Post> shares) {
        this.shares = shares;
    }

    /**
     * @return the posts
     */
    public List<Post> getPosts() {
        return posts;
    }

    /**
     * @param posts the posts to set
     */
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    /**
     * @return the session
     */
    public Map getSession() {
        return session;
    }

    /**
     * @return the supports
     */
    public List<Post> getSupports() {
        return supports;
    }

    /**
     * @param supports the supports to set
     */
    public void setSupports(List<Post> supports) {
        this.supports = supports;
    }
    
    
    
}
