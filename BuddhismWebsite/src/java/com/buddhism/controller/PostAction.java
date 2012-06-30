/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
import com.buddhism.service.postService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author GodBlessedMay
 */
public class PostAction extends ActionSupport implements SessionAware{
    
    
    protected int type = 0;
    
    protected List<Post> posts = new ArrayList<Post>();
    
    protected int currentIndex = 0;
    protected int max = 20;
    protected int maxIndex = 0;
    protected int maxPage = 0;
    
    protected Map session;
    
    protected postService service;
    
    @Override
    public void setSession(Map session) {   
  
       this.session = session;   
  
  
    }  
    
    public String jumpTo()
    {
    
        getPost();
        putIntoRequest();
        
        return "SUCCESS";
    }
    
    public PostAction()
    {

    }

    public int getMaxIndex() {
        return maxIndex;
    }

    public void setMaxIndex(int maxIndex) {
        this.maxIndex = maxIndex;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }
    
    @Override
    public String execute(){
        
       
        maxIndex = service.getPostNumber(type);
        maxPage = maxIndex / max;
            
        
        getPost();
        putIntoRequest();
        
        return "SUCCESS";
    }
    
    public void putIntoRequest()
    {
        ActionContext ctx = ActionContext.getContext();       
      
        HttpServletRequest request = (HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);       
        
        request.setAttribute("currentIndex", currentIndex);
        request.setAttribute("maxIndex", maxPage);
    }
    
    public void getPost()
    {
        Administrator ad = (Administrator)session.get("User");
        
        if (type == 0)
        {
            if (max * currentIndex + max > maxIndex)
                posts = service.getPostForAdministrator(ad, currentIndex * max, maxIndex);
                //posts = service.getPage(currentIndex * max, maxIndex);
            else
                posts = service.getPostForAdministrator(ad, currentIndex * max, max);
        }
        else 
        {
            if (max * currentIndex + max > maxIndex)
                posts = service.getPost(ad, (short)type, currentIndex * max, maxIndex);
                //posts = service.getPage(currentIndex * max, maxIndex);
            else
                posts = service.getPost(ad, (short)type, currentIndex * max, max);
        }
        
        for (int i = 0; i != posts.size(); i++)
            posts.get(i).setType();
    }

    public String nextPage(){

        if (currentIndex != maxPage)
            currentIndex++;
        
        getPost();
        putIntoRequest();
                
        return "SUCCESS";
    }
    
    public String previousPage(){
        
      
        if(currentIndex > 1)
            currentIndex--;
        
        getPost();
        putIntoRequest();

        return "SUCCESS";
    }

    public postService getService() {
        return service;
    }

    public void setService(postService service) {
        this.service = service;
    }
    
    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public String getFirst(){
        if (currentIndex == 0)
            return "false";
        else
            return "true";
    }
    
    public int getMax() {
        return max;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
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
}
