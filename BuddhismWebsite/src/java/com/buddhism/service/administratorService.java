/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.model.Administrator;

/**
 *
 * @author Trine
 */
public interface administratorService 
{
    public Administrator getAdministrator(int id);
    public Administrator getAdministrator();
    public void setAdministrator(String adName, String adPassword, int adLevel, String adRan);
    public int loginCheck(String adName, String password);
}
