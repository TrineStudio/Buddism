/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;

/**
 *
 * @author GodBlessedMay
 */
public class ArticleTrash extends PostAction{

    public void getPost()
    {
        Administrator ad = (Administrator)session.get("User");
        
        posts = service.getPostFromTrash(ad, currentIndex * max, max);
    }

}
 