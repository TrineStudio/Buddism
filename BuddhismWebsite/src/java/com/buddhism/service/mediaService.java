/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.model.Media;
import com.buddhism.model.Post;

/**
 *
 * @author Trine
 */
public interface mediaService 
{
    public void setMedia(Media media);
    public int getMediaNumber(boolean mediaType);
    public void setMedia(Post post, String mediaUrl, int mediaType);
}
