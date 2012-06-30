/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.dao;

import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
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
}
