/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

/**
 *
 * @author GodBlessedMay
 */
public class MainPageArticle extends SinglePostAction {
    
    private boolean isEnd = false;
    
    public MainPageArticle() {
        type = 0;
        max = 3;
        currentIndex = -1;
    }
    
    @Override
    public String execute()
    {
        currentIndex = -1;
        isEnd = false;
        
        maxIndex = service.getPostNumber(type);
        maxPage = maxIndex / max;
        
        return nextPage();
    }
    
    @Override
    public void getPost()
    {
        posts.clear();
        
        // List<Post> temp = new ArrayList<Post>();
        
        if (isEnd)
            return;
        
        if (max * currentIndex + max > maxIndex)
        {
            posts = service.getPost((short)type, currentIndex * max, maxIndex);
            isEnd = true;
        }         
        else
            posts = service.getPost((short)type, currentIndex * max, max);

        for (int i = 0; i != posts.size(); i++)
        {
            posts.get(i).setType();
        }
        
    }
    
}
