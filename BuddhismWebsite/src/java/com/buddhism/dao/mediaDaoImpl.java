/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Media;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Trine
 */
public class mediaDaoImpl extends HibernateDaoSupport implements mediaDao
{

    @Override
    public void addMedia(Media media) throws Exception 
    {
        try
        {
            getHibernateTemplate().save(media);
        }catch(Exception err)
        {
            throw err;
        }
    }

    @Override
    public Media getMedia(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Media getMedia(String mediaTitle) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Media> getMedia(final boolean mediaType) 
    {
                return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException {
               Query query = sn.createQuery("from Media as m where m.media_Type = :type").setBoolean("type", mediaType);
               return (List<Media>)query.list();
            }
        });
    }

    @Override
    public int getMediaNumber(boolean mediaType) 
    {
        String hqlString = "select count(*) from Media as m where m.mediaType = '"+mediaType+"'";
        Query query = this.getSession().createQuery(hqlString);
        
        return ((Number)query.uniqueResult()).intValue();
    }

    
}
