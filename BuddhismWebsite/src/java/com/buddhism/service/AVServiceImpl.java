/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.dao.AVDaoImpl;
import com.buddhism.model.Administrator;
import com.buddhism.model.Media;
import com.buddhism.model.Packet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nankonami
 */
public class AVServiceImpl implements AVService
{

    private AVDaoImpl avDao;
    @Override
    public Packet getPacket(int packetId) 
    {
        return getAvDao().getP(packetId);
    }

    @Override
    public Packet getPacket(String packetName) 
    {
        return getAvDao().getP(packetName);
    }

    @Override
    public List<Packet> getPackets(int packetType) 
    {
        return getAvDao().getPS(packetType);
    }

    @Override
    public int getPacketsNumber(int packetType) 
    {
        return getAvDao().getPN(packetType);
    }

    @Override
    public void addPacket(Packet packet) 
    {
        getAvDao().addP(packet);
    }

    @Override
    public void addPacket(String packetName, int packetType, String packetCover) 
    {
        Packet packet = new Packet();
        
        packet.setId((short)1);
        packet.setPacketFirst(packetCover);
        packet.setPacketTitle(packetName);
        packet.setPacketType((short)packetType);
        Date date = new Date(System.currentTimeMillis());
        packet.setPacketDate(date);
        
        getAvDao().addP(packet);
    }

    @Override
    public void deletePacket(int packetId) 
    {
        getAvDao().deleteP(packetId);
    }

    @Override
    public void addMedia(Media media) 
    {
        getAvDao().addM(media);
    }

    @Override
    public void addMedia(Administrator ad, Packet packet, String mediaUrl, int mediaType, String mediaDesc) 
    {
        Media media = new Media();
        
        media.setAdministrator(ad);
        media.setId(1);
        media.setMediaDesc(mediaDesc);
        media.setMediaType((short)mediaType);
        media.setMediaUrl(mediaUrl);
        media.setPacket(packet);
        Date date = new Date(System.currentTimeMillis());
        media.setMediaDate(date);
        
        getAvDao().addM(media);
    }

    @Override
    public Media getMedia(int mediaId) 
    {
        return getAvDao().getM(mediaId);
    }

    @Override
    public List<Media> getMedias(Administrator ad, int mediaType, int offset, int length) 
    {
        return getAvDao().getMS(ad, mediaType, offset, length);
    }

    @Override
    public int getMediasNumber(int mediaType) 
    {
        return getAvDao().getMN(mediaType);
    }

    @Override
    public void updatePacket(Packet packet) 
    {
        getAvDao().updatP(packet.getId(), packet.getPacketType(), packet.getPacketTitle(), 
                packet.getPacketFirst(), packet.getPacketDate());
    }

    @Override
    public void deleteMedia(int mediaId) 
    {
        getAvDao().deleteM(mediaId);
    }

    @Override
    public void updateMedia(Media media) 
    {
        getAvDao().updateM(media.getId(), media.getMediaType(), media.getMediaDesc(), 
                media.getMediaDate());
    }

    /**
     * @return the avDao
     */
    public AVDaoImpl getAvDao() {
        return avDao;
    }

    /**
     * @param avDao the avDao to set
     */
    public void setAvDao(AVDaoImpl avDao) {
        this.avDao = avDao;
    }
    
}
