/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GodBlessedMay
 */
public class ActionPair {
    
    private String actionName;
    private String actionUrl;

    public ActionPair(String actionName, String actionUrl)
    {
        this.actionName = actionName;
        this.actionUrl = actionUrl;
    }

    /**
        * @return the actionName
        */
    public String getActionName() {
        return actionName;
    }

    /**
        * @param actionName the actionName to set
        */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
        * @return the actionUrl
        */
    public String getActionUrl() {
        return actionUrl;
    }

    /**
        * @param actionUrl the actionUrl to set
        */
    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }
       
    
    public static List<ActionPair> getUrls(int type)
    {
       List<ActionPair> routeUrl = new ArrayList<ActionPair>();
       
       routeUrl.add(new ActionPair("首页", Constants.mainPageUrl)); 
       
       switch(type)
       {
           case 9:
           case 10:
               routeUrl.add(new ActionPair(Constants.columns[15], Constants.actionUrl + 15));
               break;
           case 2:
           case 3:
               routeUrl.add(new ActionPair(Constants.columns[13], Constants.actionUrl + 13));
               break;               
           case 11:
           case 12:
               routeUrl.add(new ActionPair(Constants.columns[16], Constants.actionUrl + 16));
               break;               
           case 6:
           case 7:
               routeUrl.add(new ActionPair(Constants.columns[14], Constants.actionUrl + 14));
               break;                              
       }
       
       return routeUrl;
       
    }
}
