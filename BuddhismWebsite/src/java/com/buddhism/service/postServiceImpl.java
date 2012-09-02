/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.dao.postDaoImpl;
import com.buddhism.model.Administrator;
import com.buddhism.model.Post;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Trine
 */
public class postServiceImpl implements postService
{
    private postDaoImpl postDao;
    @Override
    public List getPage(int offset, int length) 
    {
        return getPostDao().getListForPage(offset, length);
    }

    /**
     * @return the postDao
     */
    public postDaoImpl getPostDao() {
        return postDao;
    }

    /**
     * @param postDao the postDao to set
     */
    public void setPostDao(postDaoImpl postDao) {
        this.postDao = postDao;
    }

    @Override
    public void setPost(Post post) throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Post setPost(Administrator postAuthor, String postTitle, String postContent, int postCategory, boolean postUp) throws Exception 
    {
        Post post = new Post();
        
        post.setAdministrator(postAuthor);
        post.setId(1);
        post.setPostCategory((short)postCategory);
        post.setPostClickTimes(0);
        post.setPostContent(postContent);
        post.setPostTitle(postTitle);
        Date date = new Date(System.currentTimeMillis());
        //java.sql.Date sql_Date = new java.sql.Date(date.getTime());
        post.setPostDate(date);
        post.setPostUp(postUp);
        
        try
        {
            //Administrator author = post.getAdministrator();
            //author.getPosts().add(post);
            postDao.addPost(post);
            return post;
        }catch(Exception err)
        {
            throw err;
        }
        
       
    }

    @Override
    public int getPostNumber(int type) 
    {
        return postDao.getCount(type);
    }

    @Override
    public List<Post> getPost(short postType, final int offset, final int length) 
    {   
        if(postDao == null)
        {
            postDao = new postDaoImpl();
        }
        return postDao.getPost(postType, offset, length);
    }

    @Override
    public List<Post> getPostForAdministrator(final Administrator administrator, int offset, int length) 
    {
        return postDao.getPostForAdministrator(administrator, offset, length);
    }

    @Override
    public List<Post> getPost() 
    {
        return postDao.getPost(true);
    }

    @Override
    public void UpdatePost(int id, boolean update) 
    {
            postDao.Update(id, update);
    }

    @Override
    public int getUpPostNumber() 
    {
        return postDao.getUpPostCount();
    }

    @Override
    public void deletePost(int id) 
    {
        postDao.delete(id);
    }

    @Override
    public void removePost(int id) 
    {
        postDao.remove(id);
    }
    @Override
    public List<Post> getPostFromTrash(final Administrator administrator, final int offset, final int length) 
    {
       return postDao.getListFromTrash(administrator, offset, length);
    }

    @Override
    public List<Post> getPost(Administrator administrator, short postType, int offset, int length) 
    {
       return postDao.getPost(administrator, postType, offset, length);
    }

    @Override
    public Post getPost(int id) 
    {
       return postDao.getPost(id);
    }

    @Override
    public void UpdatePost(Post post) 
    {
        int id = post.getId();
        int type = post.getPostCategory();
        String title = post.getPostTitle();
        String content = post.getPostContent();
        Date date = new Date();

       postDao.UpdatePost(id, type, title, content, date);
    }

    @Override
    public void addPostClickTimes(int postId) 
    {
        postDao.addPostClickTimes(postId);
    }

    @Override
    public int getPostClickTimes(int postId) 
    {
        return postDao.getPostClickTimes(postId);
    }

    @Override
    public List<Post> getPostBetweenAnd() 
    {
        return postDao.getPostBetweenAnd();
    }

    
}
