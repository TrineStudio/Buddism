/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.model;

/**
 *
 * @author Trine
 */
public class Category {
    
    private int catId;
    private String catName;

    public Category(int catId, String catName){
        this.catId = catId;
        this.catName = catName;
    }
    
    public Category(){
    }
    
    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
    
    
    
}