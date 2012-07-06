/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.model.Media;
import com.buddhism.service.AVServiceImpl;
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
    
    private List<Media> medium = new ArrayList<Media>();
    
    protected int currentIndex = 0;
    protected int max = 20;
    protected int maxIndex = 0;
    protected int maxPage = 0;
    
    protected Map session;
    
    private AVServiceImpl service;
    
    @Override
    public void setSession(Map session) {   
  
       this.session = session;   
  
  
    }  
    
    public String jumpTo()
    {
    
        getMedia();
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
        maxIndex = getService().getMediasNumber(type);
        
        maxPage = maxIndex / max;

        getMedia();
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
    
    public void getMedia()
    {
        Administrator ad = (Administrator)session.get("User");
       
        // medium = service.getMedia(ad, type, currentIndex * max, maxIndex); 
        // TODO : 所能获取的媒体是和管理员身份有关 同时有一个选取范围的。
        setMedium(getService().getMedias(ad, type, currentIndex * max, maxIndex));
        
    }

    public String nextPage(){

        if (currentIndex != maxPage)
            currentIndex++;
        
        getMedia();
        putIntoRequest();
                
        return "SUCCESS";
    }
    
    public String previousPage(){
        
      
        if(currentIndex > 1)
            currentIndex--;
        
        getMedia();
        putIntoRequest();

        return "SUCCESS";
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
        return getMedium();
    }

    public void setMedias(List<Media> medium) {
        this.setMedium(medium);
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
    public AVServiceImpl getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(AVServiceImpl service) {
        this.service = service;
    }

    /**
     * @return the medium
     */
    public List<Media> getMedium() {
        return medium;
    }

    /**
     * @param medium the medium to set
     */
    public void setMedium(List<Media> medium) {
        this.medium = medium;
    }
}
