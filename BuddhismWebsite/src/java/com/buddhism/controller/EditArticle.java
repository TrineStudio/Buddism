/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.controller;

import com.buddhism.model.Category;
import com.buddhism.model.Constants;
import com.buddhism.model.Post;
import com.buddhism.service.postService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GodBlessedMay
 */
public class EditArticle extends ActionSupport {
    
    private Post post;
    
    private int postId;
    
    private postService service;
    
        
    private List<Category> cataList = new ArrayList<Category>();
    
    
    public List<Category> getCataList() {
        return cataList;
    }
    
    public void setCataList(List<Category> cataList) {
        this.cataList = cataList;
    }
    
    public EditArticle() {
    }
    
    public String execute() throws Exception {
        
        cataList.clear();
        
        cataList.add(new Category(Constants.informs, "重要公告"));
        cataList.add(new Category(Constants.activities, "活动剪影"));
        cataList.add(new Category(Constants.associationMessage, "协会法讯"));
        cataList.add(new Category(Constants.buddleWords, "甘露教言"));
        cataList.add(new Category(Constants.eventCalendar, "行事历"));
        cataList.add(new Category(Constants.experienceShare, "经验分享"));
        cataList.add(new Category(Constants.videoes, "影音专区"));
        cataList.add(new Category(Constants.wisdom, "智慧点滴"));
        cataList.add(new Category(Constants.teacher1,"嘉傑 果碩仁波切"));
        cataList.add(new Category(Constants.teacher2,"經論講座老師"));
        cataList.add(new Category(Constants.temple1,"康果洛寺"));
        cataList.add(new Category(Constants.temple2,"尼泊尔圆满法洲寺"));
        
        
        post = service.getPost(postId);
        post.setType();
        
        return "SUCCESS";
    }

    /**
     * @return the post
     */
    public Post getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(Post post) {
        this.post = post;
    }

    /**
     * @return the postId
     */
    public int getPostId() {
        return postId;
    }

    /**
     * @param postId the postId to set
     */
    public void setPostId(int postId) {
        this.postId = postId;
    }

    /**
     * @return the service
     */
    public postService getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(postService service) {
        this.service = service;
    }
}
