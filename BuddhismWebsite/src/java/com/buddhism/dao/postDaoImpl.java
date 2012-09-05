/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Administrator;
import com.buddhism.model.Constants;
import com.buddhism.model.Post;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/**
 *
 * @author Trine
 */
public class postDaoImpl extends HibernateDaoSupport implements postDao
{

    @Override
    public void addPost(Post post) throws Exception 
    {
        try
        {
           getHibernateTemplate().save(post); 
        }catch(Exception err)
        {
            throw err;
        }
    }

    @Override
    public Post getPost(int id) 
    {
       return (Post)getHibernateTemplate().find("from Post as p where p.id = ?", id).get(0);
    }

    @Override
    public Post getPost(String postTitle) 
    {
        return (Post)getHibernateTemplate().find("from Post as p where p.postTitle = ?", postTitle).get(0);
    }

    @Override
    public void deletePost(Post post) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getListForPage(final int offset, final int length) 
    {
        return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException {
               Query query = sn.createQuery("from Post as p where p.postCategory > 0");
               query.setFirstResult(offset);
               query.setMaxResults(length);
               return query.list();
            }
        });
    }
    
    @Override
    public int getCount()
    {
        List list = getHibernateTemplate().find("select count(*) from Post");
        return ((Long)list.iterator().next()).intValue();
    }

    @Override
    public List<Post> getPost(final short postType, final int offset, final int length) 
    {
               return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException 
            {
                String hqlString = "select p from Post p";
                
                if(postType == 13)
                   hqlString += " where p.postCategory = 2 or p.postCategory = 3 order by p.postDate desc";
                else if(postType == 14)
                   hqlString += " where p.postCategory = 6 or p.postCategory = 7 order by p.postDate desc";
                else if(postType == 15)
                    hqlString += " where p.postCategory = 9 or p.postCategory = 10 order by p.postDate desc";
                else if(postType == 16)
                   hqlString += " where p.postCategory = 11 or p.postCategory = 12 order by p.postDate desc";
                else if (postType == 0)
                   hqlString += " where p.postCategory > 0 order by p.postDate desc";
                else
                   hqlString += " where p.postCategory = " + postType + " order by p.postDate desc";
                
                Query query = sn.createQuery(hqlString);
                query.setFirstResult(offset);
                query.setMaxResults(length);
                return (List<Post>)query.list();
            }
        });
    }

    @Override
    public List<Post> getPostForAdministrator(final Administrator administrator, final int offset, final int length) 
    {
       //return (List<Post>)getHibernateTemplate().find("from Post p where p.administrator = ? order by p.postDate desc", administrator);
                return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException 
            {
               if(administrator.getAdLevel() == 0)
               {
                   Query query = sn.createQuery("from Post as p where p.postCategory > 0 order by p.postDate desc");
                   query.setFirstResult(offset);
                   query.setMaxResults(length);
                   return (List<Post>)query.list();
               }else if(administrator.getAdLevel() == 1)
               {
                   Query query2 = sn.createQuery("from Post as p where p.administrator = :admin and p.postCategory > 0 order by p.postDate desc");
                   query2.setParameter("admin", administrator);
                   query2.setFirstResult(offset);
                   query2.setMaxResults(length);
                   return (List<Post>)query2.list();
               }
               
               return null;
            }
        });
    }

    @Override
    public List<Post> getPost(boolean postUp) 
    {
        return (List<Post>)getHibernateTemplate().find("from Post as p where p.postUp = ?", postUp);
    }

    @Override
    public void Update(int id, boolean update) 
    {   
        Post newPost = this.getPost(id);
        
       Session s = this.getSession();
       s.beginTransaction();
       Query query = s.createQuery("update Post p set p.postUp = "+ update + " where p.id = " + id);
       
       query.executeUpdate();
       s.getTransaction().commit();
    }

    @Override
    public int getUpPostCount() 
    {
       return this.getPost(true).size();
    }

    @Override
    public void delete(int  id) 
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        
        Session s = this.getSession();
        s.beginTransaction();
        
        Query query2 = s.createQuery("delete from Post p where p.id ="+ id);
        
        query2.executeUpdate();
        s.getTransaction().commit();
    }

    @Override
    public void remove(int id) 
    {
        //throw new UnsupportedOperationException("Not supported yet.");
        Post post = this.getPost(id);
        Session s = this.getSession();
        s.beginTransaction();
        
        Query query = s.createQuery("update Post p set p.postCategory="+ (-post.getPostCategory()) + "where p.id="+id);
        query.executeUpdate();
        
        s.getTransaction().commit();
    }

    @Override
    public List getListFromTrash(final Administrator administrator, final int offset, final int length) 
    {
       // throw new UnsupportedOperationException("Not supported yet.");
        return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException 
            {
                if(administrator.getAdLevel() == 0)
                {
                    Query query = sn.createQuery("from Post as p where p.postCategory < 0 order by p.postDate desc");
                    query.setFirstResult(offset);
                    query.setMaxResults(length);
                    return query.list();
                }else if(administrator.getAdLevel() == 1)
                {
                    Query query2 = sn.createQuery("from Post as p where p.administrator = :admin and p.postCategory < 0 order by p.postDate desc");
                    query2.setParameter("admin", administrator);
                    query2.setFirstResult(offset);
                    query2.setMaxResults(length);
                    return query2.list();
                }
                
                return null;
            }
        });
    }

    @Override
    public int getCount(int type) 
    {
        String hqlString = "from Post as p";
        String hqlString2 = "select count(postCategory) from Post as p";
        
        
        if(type == -1)
        {
            return this.getListFromTrash().size();
        }else if(type ==0)
        {
            return this.getCount();
        }else if(type == Constants.lastestNews)
            hqlString += " where p.postCategory = 2 or p.postCategory = 3";
        else if(type == Constants.shares)
            hqlString += " where p.postCategory = 6 or p.postCategory = 7";
        else if(type == Constants.teachers)
            hqlString2 += " where p.postCategory = 9 or p.postCategory = 10";
        else if(type == Constants.temples)
            hqlString += " where p.postCategory = 11 or p.postCategory = 12";
        else
            hqlString = hqlString +  "where p.postCategory = " + type;
        
        //return ((List<Post>)getHibernateTemplate().find(hqlString)).size();
        List postList = getHibernateTemplate().find(hqlString2);
        
        Long values = (Long)postList.get(0);
        
        //return (int)Long.parseLong(values[0].toString());
        
        return values.intValue();
    }

    @Override
    public List getListFromTrash() 
    {
        return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException {
               Query query = sn.createQuery("from Post as p where p.postCategory < 0");
               return query.list();
            }
        });
    }

    @Override
    public List<Post> getPost(final Administrator administrator, final short postType, final int offset, final int length) 
    {
        return getHibernateTemplate().executeFind(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session sn) throws HibernateException, SQLException 
            {
                if(administrator.getAdLevel() == 0)
                {
                    String hqlString = "from Post as p where p.postCategory = :postType order by p.postDate desc";
                    Query query = sn.createQuery(hqlString);
                    query.setParameter("postType", postType);
                    query.setFirstResult(offset);
                    query.setMaxResults(length);
                    return (List<Post>)query.list();
                }else if(administrator.getAdLevel() == 1)
                {
                    String hqlString = "from Post as p where p.administrator = :admin and p.postCategory = :postType order by p.postDate desc";
                    Query query = sn.createQuery(hqlString);
                    query.setParameter("admin", administrator);
                    query.setParameter("postType", postType);
                    query.setFirstResult(offset);
                    query.setMaxResults(length);
                    return (List<Post>)query.list();
                }
            
                return null;
            }
        });
    }

    @Override
    public void UpdatePost(int id, int type, String title, String content, Date date) 
    {
        Session s = this.getSession();
        s.beginTransaction();
        
        String hqlString = "update Post p set p.postDate = :date, p.postTitle = :title,"
                + " p.postContent = :content, p.postCategory = :category"
                + " where p.id = :id";
        Query query = s.createQuery(hqlString);
        query.setParameter("date", date);
        query.setParameter("title", title);
        query.setParameter("content", content);
        query.setParameter("category", (short)type);
        query.setParameter("id", id);
        
        query.executeUpdate();
        
        s.getTransaction().commit();
    }

    @Override
    public void addPostClickTimes(int postId) 
    {
        Session s = this.getSession();
        s.beginTransaction();
        
        String hqlString = "update Post as p set p.postClickTimes = p.postClickTimes + 1 where p.id = :id";
        Query query = s.createQuery(hqlString);
        
        query.setParameter("id", postId);
        
        query.executeUpdate();
        s.getTransaction().commit();
    }

    @Override
    public int getPostClickTimes(int postId)
    {
        Session s = this.getSession();
        s.beginTransaction();
        String hqlString = "select new Post(p.postClickTimes) from Post p where p.id = :id";
        Query query = s.createQuery(hqlString);
        
        query.setParameter("id", postId);
        
        List list = query.list();
        s.getTransaction().commit();
        s.close();
        return ((Post)list.get(0)).getPostClickTimes();
    }

    @Override
    public List<Post> getPostBetweenAnd() 
    {
        Session s = this.getSession();
        s.beginTransaction();
        
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 6);
        Date date2 = cal.getTime();
        
        String startStr = format.format(date);
        String endStr = format.format(date2);
        
        Date startDate = null; //以当前时间作为起始时间
        Date endDate = null;    //结束时间
        
        try 
        {
            startDate= format.parse(startStr);
            endDate = format.parse(endStr);
        } catch (ParseException ex) 
        {
            Logger.getLogger(AVDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String hqlString = "select p from Post p where p.postDate between :start and :end";
        Query query = s.createQuery(hqlString);
        
        query.setParameter("start", startDate);
        query.setParameter("end", endDate);
        
        List list = query.list();
        s.close();
        
        return (List<Post>)list;
    }

    @Override
    public List<Post> getPostNameLike(String str) 
    {
        Session s = this.getSession();
        s.beginTransaction();
        
        Criteria criteria = s.createCriteria(Post.class);
        criteria.add(Expression.like("postTitle", "%" + str +"%"));
        
        List list = criteria.list();
        s.getTransaction().commit();
        s.close();
        
        return (List<Post>)list;
    }
    
    @Override
    public int getPostBetweenAnd(String start, String end)
    {
        Session s = this.getSession();
        s.beginTransaction();
        
        Criteria criteria = s.createCriteria(Post.class);
        Date startDate = java.sql.Date.valueOf(start);
        Date endDate = java.sql.Date.valueOf(end);
        //SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        
        /*try 
        {
            startDate = format.parse(start);
            endDate = format.parse(end);
            criteria.add(Expression.between("postDate", startDate, endDate));
        } catch (ParseException ex) 
        {
            Logger.getLogger(postDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        criteria.add(Expression.between("postDate", endDate, startDate));
        List list = criteria.list();
        s.getTransaction().commit();
        s.close();
        
        return list.size();
    }
}
