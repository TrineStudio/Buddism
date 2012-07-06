/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.model.Media;
import com.buddhism.model.Packet;
import java.util.List;

/**
 *
 * @author Trine
 */
public interface mediaService 
{
    public void setMedia(Media media);
    public int getMediaNumber(int mediaType);
    public void setMedia(Packet packet, String mediaUrl, int mediaType, String mediaDesc);
    public List<Media> getMedia(int mediaType);
}
