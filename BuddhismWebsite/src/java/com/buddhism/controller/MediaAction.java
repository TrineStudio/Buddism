/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.model.Media;
import com.buddhism.service.mediaService;
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
public class MediaAction extends ActionSupport implements SessionAware{
    
    
    protected int type = 0;
    
    protected List<Media> medium = new ArrayList<Media>();
    
    protected int currentIndex = 0;
    protected int max = 20;
    protected int maxIndex = 0;
    protected int maxPage = 0;
    
    protected Map session;
    
    protected mediaService service;
    
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
    
    public MediaAction()
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
        
        // 换Media的Service 获取Media数量 方法与getPostNumber一致
        // maxIndex = service.getPostNumber(type);
        maxIndex = service.getMediaNumber(type);
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
            // 获取所有 Media
            // medium = 
            medium = service.getMedia(type);
        }
        else 
        {
           // 获取对应集合ID(从1开始)的Media
        }
        
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

    public mediaService getService() {
        return service;
    }

    public void setService(mediaService service) {
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

    public List<Media> getMedias() {
        return medium;
    }

    public void setMedias(List<Media> medium) {
        this.medium = medium;
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
