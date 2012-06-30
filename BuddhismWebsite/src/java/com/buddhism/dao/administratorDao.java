/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Administrator;

/**
 *
 * @author nankonami
 */
public interface administratorDao 
{
    public void add(Administrator ad) throws Exception;
    public Administrator getAdministrator(int id);
    public Administrator getAdministrator(String adName);
}
