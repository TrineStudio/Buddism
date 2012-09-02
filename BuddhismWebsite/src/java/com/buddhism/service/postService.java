/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
import java.util.List;

/**
 *
 * @author Trine
 */
public interface postService 
{
    public List getPage(final int offset, final int length);
    public void setPost(Post post) throws Exception;
    public Post setPost(Administrator postAuthor, String postTitle, String postContent, int postCategory, 
           boolean postUp) throws Exception;
    public int getPostNumber(int type);
    public int getUpPostNumber();
    public void UpdatePost(int id, boolean update);
    public List<Post> getPost(short postType, final int offset, final int length);
    public List<Post> getPost(Administrator administrator, short postType, int offset, int length);
    public List<Post> getPost();
    public Post getPost(int id);
    public List<Post> getPostForAdministrator(final Administrator administrator, final int offset, final int length);
    public List<Post> getPostFromTrash(final Administrator administrator, final int offset, final int length);
    public void deletePost(int id);
    public void removePost(int id);
    public void UpdatePost(Post post);
    
    public void addPostClickTimes(int postId);  //add click time by 1
    public int getPostClickTimes(int postId);   //get click times
    
    public List<Post> getPostBetweenAnd();  //get post during a period of time
}
