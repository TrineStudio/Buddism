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
public class photoListAction extends MediaAction{
    
    private String title;
    private String nav;
    
    private List<ActionPair> actionPair;
    
    @Override
    public void getMedia()
    {
        medium = service.getMedias(packetId, currentIndex * max, maxIndex); 
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
    public void pairToNav(List<ActionPair> actionPair)
    {
        setNav("");
        
        for (int i = 0; i != actionPair.size(); i++)
        {
            ActionPair temp = actionPair.get(i);
            setNav(getNav() + "<a href=" + temp.getActionUrl() + " style=\"color:white\">" + temp.getActionName() + "</a> >> ");
        }
        
        nav += "图片";
    }    
    
    public void setActionPair(List<ActionPair> actionPair) {
        this.actionPair = actionPair;
    }
    
    @Override
    public String execute()
    {
        actionPair = ActionPair.getUrls(5);
        actionPair.add(new ActionPair(Constants.columns[5], "albumAction.action?type=5"));
        
        pairToNav(actionPair);
        
        return super.execute();
    }
    
}
