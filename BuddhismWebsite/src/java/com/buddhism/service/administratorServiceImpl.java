/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.dao.administratorDaoImpl;
import com.buddhism.model.Administrator;
import com.buddhism.tool.SHA1;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trine
 */
public class administratorServiceImpl implements administratorService
{   
    private administratorDaoImpl adDao;

    @Override
    public Administrator getAdministrator(int id) 
    {
        return getAdDao().getAdministrator(id);
    }

    @Override
    public void setAdministrator(String adName, String adPassword, int adLevel, String adRan) 
    {
        Administrator administrator = new Administrator();
        administrator.setId((short)1);
        administrator.setAdRanNum(adRan);
        administrator.setAdName(adName);
        administrator.setAdLevel(adLevel);
        administrator.setAdPassword(adPassword);
        
        try {
            adDao.add(administrator);
        } catch (Exception ex) {
            Logger.getLogger(administratorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    /**
     * @return the adDao
     */
    public administratorDaoImpl getAdDao() {
        return adDao;
    }

    /**
     * @param adDao the adDao to set
     */
    public void setAdDao(administratorDaoImpl adDao) {
        this.adDao = adDao;
    }

    @Override
    public int loginCheck(String adName, String password) 
    {
       if(adDao.getAdministrator(adName) == 2)
       {
           String str = adDao.getAdministrator().getAdRanNum();
           String str1 = adDao.getAdministrator().getAdPassword();
           
           
           if(SHA1.checkPasswordByInput(password, str, str1))
               return 3;//login successfully
           else
               return 1;//input the wrong code
       }else
           return 0;   //there is no such a user
    }

    @Override
    public Administrator getAdministrator() 
    {
        return adDao.getAdministrator();
    }
}
