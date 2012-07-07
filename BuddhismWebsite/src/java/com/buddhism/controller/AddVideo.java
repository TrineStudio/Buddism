/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Administrator;
import com.buddhism.model.Category;
import com.buddhism.model.Packet;
import com.buddhism.service.AVServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author GodBlessedMay
 */
public class AddVideo extends ActionSupport implements SessionAware{
private List<Category> catList = new ArrayList<Category>();
    
    private AVServiceImpl packet;
    
    private Map session;
    
    @Override
    public void setSession(Map session) {   
  
       this.session = session;   
  
  
    }  
    
    public AddVideo() {
    }
    
    @Override
    public String execute(){
        
        Administrator ad = (Administrator)session.get("User");
        
        catList.clear();
        
        List<Packet> packets = new ArrayList<Packet>();
        
        // TODO: 获取所有集合(Packet)
        packets = packet.getPackets(ad, 1);//第一个参数应该是administrator
        
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
    public AVServiceImpl getPacket() {
        return packet;
    }

    /**
     * @param packet the packet to set
     */
    public void setPacket(AVServiceImpl packet) {
        this.packet = packet;
    }
    
}
