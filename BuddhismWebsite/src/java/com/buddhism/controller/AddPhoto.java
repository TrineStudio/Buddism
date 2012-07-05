/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Category;
import com.buddhism.model.Packet;
import com.buddhism.service.packetService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GodBlessedMay
 */
public class AddPhoto extends ActionSupport {
        
    private List<Category> catList = new ArrayList<Category>();
    
    private packetService packet;
    
    public AddPhoto() {
    }
    
    @Override
    public String execute(){
        
        catList.clear();
        
        List<Packet> packets = new ArrayList<Packet>();
        
        // TODO: 获取所有集合(Packet)
        packets = getPacket().getPackets(0);
        
        for (int i = 0; i != packets.size(); i++)
        {
            Packet temp = packets.get(i);
            catList.add(new Category(temp.getId(), temp.getPacketTitle()));
        }
        
        return "SUCCESS";
    }
    /**
     * @return the catList
     */
    public List<Category> getCatList() {
        return catList;
    }

    /**
     * @param catList the catList to set
     */
    public void setCatList(List<Category> catList) {
        this.catList = catList;
    }

    /**
     * @return the packet
     */
    public packetService getPacket() {
        return packet;
    }

    /**
     * @param packet the packet to set
     */
    public void setPacket(packetService packet) {
        this.packet = packet;
    }
   
}
