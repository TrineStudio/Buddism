/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.ActionPair;
import com.buddhism.model.Constants;
import java.util.List;

/**
 *
 * @author GodBlessedMay
 */
public class GetMediumAction extends MediaAction{
    private String title;
    private String nav;
    
    private List<ActionPair> actionPair;
 
    public GetMediumAction() 
    {
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    public void putToSession()
    {
        session.put("medium", medium);
    }
    
    public void pairToNav()
    {
        nav = "";
        
        for (int i = 0; i != actionPair.size(); i++)
        {
            ActionPair temp = actionPair.get(i);
            nav += "<a href=" + temp.getActionUrl() + " style=\"color:white\">" + temp.getActionName() + "</a> >> ";
        }
        
        nav += "视频";
    }
    
    @Override
    public String execute()
    {
        title = Constants.columns[8];
        
        actionPair = ActionPair.getUrls(8);
        actionPair.add(new ActionPair(Constants.columns[8], "albumAction.action?type=8"));
        
        pairToNav();
        
        super.execute(); 
        putToSession();
        
        return "SUCCESS";
    }
    
    @Override
    public void getMedia()
    {
        medium = service.getMedias(packetId, currentIndex * max, maxIndex);
    }
    
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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

    
}    
