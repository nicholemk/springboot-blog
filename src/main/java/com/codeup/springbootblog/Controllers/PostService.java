package com.codeup.springbootblog.Controllers;

import com.codeup.springbootblog.daos.PostRepository;
import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private PostRepository postDao;

    public PostService(PostRepository postDao) {
        this.postDao = postDao;
    }

    public Iterable<Post> findAll() {
        return postDao.findAll();
    }

    public Post save(Post post) {
        postDao.save(post);
        return post;
    }

    public Post findOne(long id) {
        return postDao.findOne(id);
    }

    public void update(Post post) {
        postDao.save(post);
    }

    public void delete(long id) {
        postDao.delete(id);
    }
}