/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.model;

/**
 *
 * @author GodBlessedMay
 */
public class User {
    
    private int userTypeId;
    private String userType;

    /**
     * @return the userTypeId
     */
    public int getUserTypeId() {
        return userTypeId;
    }

    public User(int userTypeId, String userType)
    {
        this.userTypeId = userTypeId;
        this.userType = userType;
    }
    
    /**
     * @param userTypeId the userTypeId to set
     */
    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    
}
