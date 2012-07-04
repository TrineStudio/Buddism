/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Category;
import com.buddhism.model.Packet;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GodBlessedMay
 */
public class PhotoPage extends PostAction {
    
    private List<Category> catList = new ArrayList<Category>();
    
    public PhotoPage() {
    }
    
    @Override
    public String execute(){
        
        List<Packet> packets = new ArrayList<Packet>();
        
        // TODO: 获取所有集合(Packet)
        
        catList.add(new Category(0, "所有相册"));
        
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

   
}
