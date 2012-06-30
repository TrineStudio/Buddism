/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.model;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Trine
 */
public class PicturePost {
    private String title;
    private String url;

    public PicturePost(Post post)
    {
        this.title = post.getPostTitle();
        Set<Media> medium = post.getMedias();
        
        Iterator it = medium.iterator();
        
        Media media = (Media) it.next();
        url = media.getMediaUrl();
        
        int index = 0;
        
        for (index = url.length() - 1; index != -1; index--)
        {
            char temp = url.charAt(index);
            if (url.charAt(index) == '/' || url.charAt(index) == '\\')
                break;
        }
        url = url.substring(index + 1, url.length());
        url = "pics/" + url;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
}
