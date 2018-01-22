//package com.codeup.sequoiaspringbootblog.services;
//
//import com.codeup.sequoiaspringbootblog.models.Ad;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class PostService {
//    private List<Post> ads;
//
//    public PostService() {
//        Posts = new ArrayList<>();
//        createPosts();
//    }
//
//    public List<Post> findAll() {
//        return Posts;
//    }
//
//    public Post save(Post Post) {
//        Post.setId(Posts.size() + 1);
//        Posts.add(Post);
//        return Post;
//    }
//
//    public Post findOne(long id) {
//        return Posts.get((int)(id - 1));
//    }
//
//    private void createPosts() {
//        save(new Post("Ad A", "Description A"));
//        save(new Post("Ad B", "Description B"));
//        save(new Post("Ad C", "Description C"));
//    }
//}