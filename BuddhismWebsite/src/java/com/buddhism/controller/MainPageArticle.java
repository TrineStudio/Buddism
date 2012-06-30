/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Post;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GodBlessedMay
 */
public class MainPageArticle extends SinglePostAction {
    
    public MainPageArticle() {
        type = 0;
        max = 3;
        currentIndex = -1;
    }
    
    @Override
    public String execute()
    {
        maxIndex = service.getPostNumber(type);
        maxPage = maxIndex / max;
        
        return nextPage();
    }
    
    @Override
    public void getPost()
    {
  
        List<Post> temp = new ArrayList<Post>();
        
        if (posts.size() == maxIndex)
            return;
        
        if (max * currentIndex + max > maxIndex)
            temp = service.getPost((short)type, currentIndex * max, maxIndex);
            //posts = service.getPage(currentIndex * max, maxIndex);
        else
            temp = service.getPost((short)type, currentIndex * max, max);

        for (int i = 0; i != temp.size(); i++)
        {
            temp.get(i).setType();
            posts.add(temp.get(i));
        }
        
    }
    
}
