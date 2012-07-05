/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Category;
import com.buddhism.model.Packet;
import com.buddhism.service.packetService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GodBlessedMay
 */
public class PhotoPage extends MediaAction {
    
    private List<Category> catList = new ArrayList<Category>();
    private packetService packetSer;
    
    
    public PhotoPage() {
    }
    
    @Override
    public String execute(){
        
        List<Packet> packets = new ArrayList<Packet>();
        
        // TODO: 获取所有集合(Packet)
        packets = packetSer.getPackets(type);
        
        catList.add(new Category(0, "所有相册"));
        
        for (int i = 0; i != packets.size(); i++)
        {
            Packet temp = packets.get(i);
            catList.add(new Category(temp.getId(), temp.getPacketTitle()));
        }
        
        super.execute();
        
        return "SUCCESS";
    }
    
    public String getByType()
    {
        currentIndex = 0;

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
     * @return the packetSer
     */
    public packetService getPacketSer() {
        return packetSer;
    }

    /**
     * @param packetSer the packetSer to set
     */
    public void setPacketSer(packetService packetSer) {
        this.packetSer = packetSer;
    }

   
}
