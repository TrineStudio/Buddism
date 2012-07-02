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
public class ArticleList extends SinglePostAction {
    
    private String title;
    private String nav;
    
    private List<ActionPair> actionPair;
    
    
    public ArticleList() 
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
        session.put("posts", posts);
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
    
    @Override
    public String execute()
    {
        title = Constants.columns[type];
        
        actionPair = ActionPair.getUrls(type);
        pairToNav();
        
        super.execute(); 
        putToSession();
        
        return "SUCCESS";
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
