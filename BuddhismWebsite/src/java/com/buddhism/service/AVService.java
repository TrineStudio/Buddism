/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.model.Administrator;
import com.buddhism.model.Media;
import com.buddhism.model.Packet;
import java.util.List;

/**
 *
 * @author nankonami
 */
public interface AVService 
{
    public Packet getPacket(int packetId);
    public Packet getPacket(String packetName);
    public List<Packet> getPackets(Administrator ad, int packetType);
    public List<Packet> getPackets(int packetType);
    public int getPacketsNumber(Administrator ad, int packetType);
    
    public void addPacket(Packet packet);
    public void addPacket(Administrator ad, String packetName, int packetType, String packetCover);
    
    public void deletePacket(int packetId);
    
    public void updatePacket(Packet packet);
    
    public void addMedia(Media media);
    public void addMedia(Administrator ad, Packet packet, String mediaUrl, int mediaType, String mediaDesc,
            int mediaClickTimes);
    
    public Media getMedia(int mediaId);
    public List<Media> getMedias(Administrator ad, int mediaType, int offset, int length);
    public int getMediasNumber(int mediaType);
    
    public void deleteMedia(int mediaId);
    
    public void updateMedia(Media media);
    
    public List<Media> getMedias(int packetId, int offset, int length);
    
    public List<Media> getMediaSet(int type, int offset,int length);
    
    public void addMediaClickTimes(int mediaId); //add click time by 1
    public int getMediaClickTimes(int mediaId); //get click times
    
    public List<Media> getMediaBetweenAnd();    //get media during a period of time
    
    public int getMediaBetweenAnd(String start, String end, int type); //get media amount between start and end which type is type.
}
