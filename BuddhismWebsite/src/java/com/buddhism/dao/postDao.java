/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Trine
 */
public interface postDao 
{
    public void addPost(Post post) throws Exception;
    public Post getPost(int id);
    public Post getPost(String postTitle);
    public void deletePost(Post post);
    public List getListForPage(final int offset, final int length);
    public List getListFromTrash(final Administrator administrator, final int offset, final int length);
    public List getListFromTrash();
    public int getCount();
    public int getUpPostCount();
    public int getCount(int type);
    public List<Post> getPost(short postType, final int offset, final int length);
    public List<Post> getPost(final Administrator administrator, short postType, final int offset, final int length);
    public List<Post> getPost(boolean postUp);
    public List<Post> getPostForAdministrator(final Administrator administrator, final int offset, final int length);
    public void Update(int id, boolean update);
    public void delete(int id);
    public void remove(int id);
    public void UpdatePost(int id, int type, String title, String content, Date date);
    
    public void addPostClickTimes(int postId); //add post click times by 1
    public int getPostClickTimes(int postId);   //get post click times
    
    public List<Post> getPostBetweenAnd(); //get post during a period of time
    
    public List<Post> getPostNameLike(String str);
    
    public int getPostBetweenAnd(String start, String end); //get post between the start and end time
}
