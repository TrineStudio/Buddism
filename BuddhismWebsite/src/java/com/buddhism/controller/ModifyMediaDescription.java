/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Media;
import com.buddhism.service.AVService;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Administrator
 */
public class ModifyMediaDescription implements SessionAware{
        
    private Map session;
    
    private String desc;
    private int mediaID;
    
    private AVService service;

    public AVService getService() {
        return service;
    }

    public void setService(AVService service) {
        this.service = service;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getMediaID() {
        return mediaID;
    }

    public void setMediaID(int mediaID) {
        this.mediaID = mediaID;
    }       
    
    @Override
    public void setSession(Map session) {   
       this.session = session;   
    }
    
    public String execute()
    {
        Media media = service.getMedia(mediaID);
        media.setMediaDesc(desc);
        
        service.updateMedia(media);
        
        return "SUCCESS";
    }
}
