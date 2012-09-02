/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Administrator;
import com.buddhism.model.Media;
import com.buddhism.model.Packet;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nankonami
 */
public interface AVDao 
{
    public Packet getP(int id);
    public Packet getP(String name);
    public int getPN(Administrator ad, int type);//获得某个管理员的相册集或者是视频集的数量
    public int getPN(int type); //获得相册集或者是视频集的数量
    public List<Packet> getPS(Administrator ad, int packetType); //获得这个用户的所有的相册集或者是视频集
    public List<Packet> getPS(int packetType);
    
    public void addP(Packet p);
    
    public void deleteP(int id);
    
    public void updatP(int id, int type, String name, String first, Date date);
    
    public Media getM(int id);
    public Media getM(String title);
    public int getMN(int type);
    public List<Media> getMS(Administrator ad, int type, int offset, int length);//获得某个管理员的media集合
    
    public void addM(Media m);
    
    public void deleteM(int id);
    
    public void updateM(int id, short type, String desc, Date date);
    
    public List<Media> getMS(int packetId, int offset, int length);
    
    public List<Media> getMSN(int type, int offset, int length);
    
    public void addMediaClickTimes(int mediaId); //点击书加一
    
    public int getMediaClickTimes(int mediaId); //获取该media的点击数
    
    public List<Media> getMediaBetweenAnd(); //获取近六个月的media的list
}
