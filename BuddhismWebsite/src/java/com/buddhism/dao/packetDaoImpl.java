/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Media;
import com.buddhism.model.Packet;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author nankonami
 */
public class packetDaoImpl extends HibernateDaoSupport implements packetDao
{

    //新建一个packet
    @Override
    public void add(Packet packet) throws Exception 
    {
        try
        {
            getHibernateTemplate().save(packet);
        }catch(Exception e)
        {
            throw e;
        }
    }

    //删除一个packet
    @Override
    public void delete(int id) 
    {
        Session s = this.getSession();
        
        Query query = s.createQuery("delete from Packet as p where p.id = "+id);
        query.executeUpdate();
        
        s.getTransaction().commit();
    }

    //根据id返回一个packet
    @Override
    public Packet getPacket(int id) 
    {
        return getHibernateTemplate().load(Packet.class, id);
    }

    //根据名字返回一个packet
    @Override
    public Packet getPacket(String packetName) 
    {
        List<Packet> packets = getHibernateTemplate().find("from Packet as p where p.packetTitle = ?",packetName);
        
        return packets.get(0);
    }

    @Override
    public void updateCover(String url, int id) 
    {
       Session s = this.getSession();
       
       Query query = s.createQuery("update Packet p set p.packetFirst = "+ url + "where p.id ="+ id);
       query.executeUpdate();
       
       s.getTransaction().commit();
    }

    @Override
    public List<Media> getMedia(int id) 
    {
        Packet packet = this.getPacket(id);
        
        Session s = this.getSession();
        Query query = s.createQuery("from Media as m where m.packet = :pack");
        query.setParameter("pack", packet);
        
        return (List<Media>)query.list();
    }

    @Override
    public List<Media> getMedia(String packetName) 
    {
        Packet packet = this.getPacket(packetName);
        
        Session s = this.getSession();
        Query query = s.createQuery("from Media as m where m.packet = :pack");
        query.setParameter("pack", packet);
        
        return (List<Media>)query.list();
    }

    @Override
    public List<Packet> getPackets(int type) 
    {
        String hqlString = "from Packet as p ";
        
        if(type == 0)
        {
            return (List<Packet>)getHibernateTemplate().find(hqlString);
        }else 
        {
            Session s = this.getSession();
            hqlString += "where p.packetType = :type"; 
            Query query = s.createQuery(hqlString);
            query.setParameter("type", (short)type);
            
            return (List<Packet>)query.list();
        }
    }
    
}
