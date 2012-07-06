/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Administrator;
import com.buddhism.model.Media;
import com.buddhism.model.Packet;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author nankonami
 */
public class AVDaoImpl extends HibernateDaoSupport implements AVDao
{

    private static String PACKETQUERYSTRING = "from Packet as p where "; 
    private static String MEDIAQUERYSTRING = "from Media as m where ";
    
    @Override
    public Packet getP(int id) 
    {
       Session s = this.getSession();
       
       String hql = "p.id = :id";
       Query query = s.createQuery(PACKETQUERYSTRING + hql);
       query.setParameter("id", (short)id);
       
       return (Packet)query.list().get(0);
    }

    @Override
    public Packet getP(String name) 
    {
       Session s = this.getSession();
       s.beginTransaction();
       
       String hql = "p.packetTitle = :title";
       Query query = s.createQuery(PACKETQUERYSTRING + hql);
       query.setParameter("title", name);
       
       s.getTransaction().commit();
       
       return (Packet)query.list().get(0);
    }

    @Override
    public int getPN(int type) 
    {
        List list = getHibernateTemplate().find("select count(*) from Packet as p where p.packetType = ?", (short)type);
        return ((Long)list.iterator().next()).intValue();
    }

    @Override
    public List<Packet> getPS(int packetType) 
    {
       Session s = this.getSession();
       
       String hql = "p.packetType = :type";
       Query query = s.createQuery(PACKETQUERYSTRING + hql);
       query.setParameter("title", (short)packetType);
       return query.list();
    }

    @Override
    public void addP(Packet p) 
    {
        getHibernateTemplate().save(p);
    }

    @Override
    public void deleteP(int id) 
    {
       Session s = this.getSession();
       s.beginTransaction();
       
       Query query = s.createQuery("delete from Packet as p where p.id = :id");
       query.setParameter("id", (short)id);
       query.executeUpdate();
       
       s.getTransaction().commit();
    }

    @Override
    public void updatP(int id, int type, String name, String first, Date date) 
    {
        Session s = this.getSession();
        s.beginTransaction();
        
        String hqlString = "update Packet as p set p.packetType = :type, p.packetTitle = :name"
                + ", p.packetFirst = :frist, p.packetDate = :date where p.id = :id";
        Query query = s.createQuery(hqlString);
        
        query.setParameter("type", (short)type);
        query.setParameter("name",name);
        query.setParameter("first", first);
        query.setParameter("date", date);
        query.setParameter("id", (short)id);
        
        query.executeUpdate();
        
        s.getTransaction().commit();
    }

    @Override
    public Media getM(int id) 
    {
        String hql = MEDIAQUERYSTRING + "m.id = ?";
        return (Media)getHibernateTemplate().find(hql, id);
    }

    @Override
    public Media getM(String title) 
    {
        String hql = MEDIAQUERYSTRING + "m.mediaDesc = ?";
        return (Media)getHibernateTemplate().find(hql, title);
    }

    @Override
    public int getMN(int type) 
    {
        List list = getHibernateTemplate().find("select count(*) from Media where m.mediaType = ?", (short)type);
        return ((Long)list.iterator().next()).intValue();
    }

    @Override
    public List<Media> getMS(final Administrator ad, final int type, final int offset, final int length) 
    {
        return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException {
               Query query = sn.createQuery("from Media as m where m.administrator = :ad and m.mediaType = :type");
               query.setParameter("ad", ad);
               query.setParameter("type", (short)type);
               query.setFirstResult(offset);
               query.setMaxResults(length);
               return query.list();
            }
        });
    }

    @Override
    public void addM(Media m) 
    {
        getHibernateTemplate().save(m);
    }

    @Override
    public void deleteM(int id) 
    {
       Session s = this.getSession();
       s.beginTransaction();
       
       Query query = s.createQuery("delete from Media as m where m.id = :id");
       query.setParameter("id", (short)id);
       query.executeUpdate();
       
       s.getTransaction().commit();
    }

    @Override
    public void updateM(int id, int type, String desc, Date date) 
    {
        Session s = this.getSession();
        s.beginTransaction();
        
        String hqlString = "update Media as m set m.mediaType = :type, m.mediaDesc = :desc"
                + ", m.mediaDate = :date where m.id = :id";
        Query query = s.createQuery(hqlString);
        
        query.setParameter("type", (short)type);
        query.setParameter("desc", desc);
        query.setParameter("date", date);
        query.setParameter("id", (short)id);
        
        query.executeUpdate();
        
        s.getTransaction().commit();
    }
    
}
