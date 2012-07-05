package com.buddhism.model;
// Generated 2012-7-6 2:46:09 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Post generated by hbm2java
 */
public class Post  implements java.io.Serializable {


     private Integer id;
     private Administrator administrator;
     private Date postDate;
     private String postTitle;
     private String postContent;
     private String type;
     private int postClickTimes;
     private short postCategory;
     private boolean postUp;
     private int postTop;

    public Post() {
    }

    public Post(Administrator administrator, Date postDate, String postTitle, String postContent, int postClickTimes, short postCategory, boolean postUp, int postTop) {
       this.administrator = administrator;
       this.postDate = postDate;
       this.postTitle = postTitle;
       this.postContent = postContent;
       this.postClickTimes = postClickTimes;
       this.postCategory = postCategory;
       this.postUp = postUp;
       this.postTop = postTop;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Administrator getAdministrator() {
        return this.administrator;
    }
    
    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
    public Date getPostDate() {
        return this.postDate;
    }
    
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    public String getPostTitle() {
        return this.postTitle;
    }
    
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
    public String getPostContent() {
        return this.postContent;
    }
    
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
    public int getPostClickTimes() {
        return this.postClickTimes;
    }
    
    public void setPostClickTimes(int postClickTimes) {
        this.postClickTimes = postClickTimes;
    }
    public short getPostCategory() {
        return this.postCategory;
    }
    
    public void setPostCategory(short postCategory) {
        this.postCategory = postCategory;
    }
    public boolean isPostUp() {
        return this.postUp;
    }
    
    public void setPostUp(boolean postUp) {
        this.postUp = postUp;
    }
    public int getPostTop() {
        return this.postTop;
    }
    
    public void setPostTop(int postTop) {
        this.postTop = postTop;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType() {
        this.type = Constants.columns[postCategory];
    }




}


