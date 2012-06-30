/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

/**
 *
 * @author GodBlessedMay
 */
public class ArticleList extends SinglePostAction {
    
    private String title;
    
    public ArticleList() 
    {
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
    
    
}
