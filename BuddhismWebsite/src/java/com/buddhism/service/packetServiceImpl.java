/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.dao.packetDaoImpl;
import com.buddhism.model.Media;
import com.buddhism.model.Packet;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nankonami
 */
public class packetServiceImpl implements packetService
{
    private packetDaoImpl packetDao;
    @Override
    public void setPacket(String title, int type, String first) 
    {
        Packet packet = new Packet();
        
        packet.setId((short)1);
        packet.setPacketFirst(first);
        packet.setPacketTitle(title);
        Date date = new Date(System.currentTimeMillis());
        packet.setPacketDate(date);
        
        
        try {
            packetDao.add(packet);
        } catch (Exception ex) {
            Logger.getLogger(packetServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletePacket(int id) 
    {
        packetDao.delete(id);
    }

    @Override
    public Packet getPacket(String name) 
    {
        return packetDao.getPacket(name);
    }

    @Override
    public List<Media> getMedia(int id) 
    {
        return packetDao.getMedia(id);
    }

    @Override
    public List<Media> getMedia(String name) 
    {
        return packetDao.getMedia(name);
    }

    /**
     * @return the packetDao
     */
    public packetDaoImpl getPacketDao() {
        return packetDao;
    }

    /**
     * @param packetDao the packetDao to set
     */
    public void setPacketDao(packetDaoImpl packetDao) {
        this.packetDao = packetDao;
    }
    
}
