/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Media;
import java.util.List;

/**
 *
 * @author Trine
 */
public interface mediaDao 
{
    public void addMedia(Media media) throws Exception;
    public Media getMedia(int id);
    public Media getMedia(String mediaTitle);
    public List<Media> getMediaByType(int mediaType);
    public int getMediaNumber(int mediaType);
}
