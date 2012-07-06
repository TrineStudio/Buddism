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
 * @author nankonami
 */
public interface packetService 
{
    public void setPacket(String title, int type, String first);
    public void deletePacket(int id);
    public Packet getPacket(String name);
    public Packet getPacket(int id);
    public List<Media> getMedia(int id);
    public List<Media> getMedia(String name);
    public List<Packet> getPackets(int type);
}
