/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Media;
import com.buddhism.service.AVService;
import com.opensymphony.xwork2.ActionSupport;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author GodBlessedMay
 */
public class MediaDownload extends ActionSupport {
    
    private int mediaId;
    
    private InputStream inputStream;
    
    private AVService service;
    
    private String fileName;
    
    public MediaDownload() {
    }
    
    public String execute()
    {
        Media media = getService().getMedia(mediaId);
        try 
        {
            inputStream = new FileInputStream(ServletActionContext.getServletContext().getRealPath(media.getMediaUrl()));
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(MediaDownload.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        fileName = media.getMediaUrl();
        
        int index = fileName.length() - 1;
        
        for (; index != -1; index--)
            if (index == '\\' || index == '/')
                break;
        
        fileName = fileName.substring(index);
        
        return "SUCCESS";
    }

    /**
     * @return the mediaId
     */
    public int getMediaId() {
        return mediaId;
    }

    /**
     * @param mediaId the mediaId to set
     */
    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * @return the inputStream
     */
    public InputStream getInputStream() {
        return inputStream;
    }

    /**
     * @param inputStream the inputStream to set
     */
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the service
     */
    public AVService getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(AVService service) {
        this.service = service;
    }
}
