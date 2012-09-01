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
public class AddMediaDescription implements SessionAware{
    
    private int mediaId;
    private Media media;
    
    private Map session;
    
    private AVService service;

    @Override
    public void setSession(Map session) {   
       this.session = session;   
    }     
    
    public int getMediaId() {
        return mediaId;
    }

    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }
    
    public String execute()
    {
        media = service.getMedia(mediaId);
        return "SUCCESS";
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public AVService getService() {
        return service;
    }

    public void setService(AVService service) {
        this.service = service;
    }
    
}
