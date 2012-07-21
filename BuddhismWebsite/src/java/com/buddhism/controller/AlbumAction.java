/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.ActionPair;
import com.buddhism.model.Constants;
import com.buddhism.model.Packet;
import com.buddhism.service.AVService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GodBlessedMay
 */
public class AlbumAction {
    
    private String title;
    private String nav;
    
    private List<ActionPair> actionPair;
    
    private AVService service;
    private List<Packet> albums = new ArrayList<Packet>();
    
    private int type;
    
    public AlbumAction() {
    }
    
    public void pairToNav()
    {
        nav = "";
        
        for (int i = 0; i != actionPair.size(); i++)
        {
            ActionPair temp = actionPair.get(i);
            nav += "<a href=" + temp.getActionUrl() + " style=\"color:white\">" + temp.getActionName() + "</a> >> ";
        }
        
        nav += title + " >> 列表";
    }
    
    public String execute(){
        
        title = Constants.columns[type];
        
        actionPair = ActionPair.getUrls(type);
        pairToNav();
        if (type == 5)
            albums = service.getPackets(0);
        else if (type == 8)
            albums = service.getPackets(1);
        
        return "SUCCESS";
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

    /**
     * @return the albums
     */
    public List<Packet> getAlbums() {
        return albums;
    }

    /**
     * @param albums the albums to set
     */
    public void setAlbums(List<Packet> albums) {
        this.albums = albums;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the nav
     */
    public String getNav() {
        return nav;
    }

    /**
     * @param nav the nav to set
     */
    public void setNav(String nav) {
        this.nav = nav;
    }

    /**
     * @return the actionPair
     */
    public List<ActionPair> getActionPair() {
        return actionPair;
    }

    /**
     * @param actionPair the actionPair to set
     */
    public void setActionPair(List<ActionPair> actionPair) {
        this.actionPair = actionPair;
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
