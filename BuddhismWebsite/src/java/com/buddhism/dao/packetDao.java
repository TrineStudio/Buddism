/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Media;
import com.buddhism.model.Packet;
import java.util.List;

/**
 *
 * @author nankonami
 */
public interface packetDao 
{
    public void add(Packet packet) throws Exception;
    public void delete(int id);
    public Packet getPacket(int id);
    public Packet getPacket(String packetName);
    public void updateCover(String url, int id);
    public List<Media> getMedia(int id);
    public List<Media> getMedia(String packetName);
    public List<Packet> getPackets(int type);
}
