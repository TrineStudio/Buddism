/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Administrator;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author nankonami
 */
public class administratorDaoImpl extends HibernateDaoSupport implements administratorDao
{   
    private Administrator administrator;
    @Override
    public void add(Administrator ad) throws Exception 
    {
            try
            {
                getHibernateTemplate().save(ad);
            }catch(Exception err)
            {
                throw err;
            }
    }

    @Override
    public Administrator getAdministrator(int id) 
    {
       return (Administrator)getHibernateTemplate().load(Administrator.class, id);
    }

    @Override
    public int getAdministrator(String adName) 
    {
          List<Administrator> administrators = getHibernateTemplate().find("from Administrator as a where a.adName = ?", adName);
      
      if(administrators.isEmpty())
          return 1;//there is no such user
      else
      {
          this.setAdministrator(administrators.get(0));
          return 2;//there is such a user
      }
    }

    @Override
    public Administrator getRanString(String adName) 
    {
      return (Administrator)getHibernateTemplate().find("from Administrator as a where a.adName = ?", adName).get(0);
    }

    /**
     * @return the administrator
     */
    public Administrator getAdministrator() {
        return administrator;
    }

    /**
     * @param administrator the administrator to set
     */
    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}
