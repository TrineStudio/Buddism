/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

/**
 *
 * @author GodBlessedMay
 */
public class SinglePostAction extends PostAction {
    
    public SinglePostAction() {
    }
    
    public void getPost()
    {
  
        if (max * currentIndex + max > maxIndex)
            posts = service.getPost((short)type, currentIndex * max, maxIndex);
            //posts = service.getPage(currentIndex * max, maxIndex);
        else
            posts = service.getPost((short)type, currentIndex * max, max);

        
        for (int i = 0; i != posts.size(); i++)
            posts.get(i).setType();
    }

    
}
