package com.codeup.springbootblog.Controllers;

import com.codeup.springbootblog.Controllers.PostService;
import com.codeup.springbootblog.daos.PostRepository;
import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Page to search posts
// 1. Create a form in the navigation bar
//    - Find the fragment and add a new one for the search form
// 2. Create a controller action to perform the search
//    - Create a SearchController
//    - Method to search by a term (GetMapping /search)
// 3. Write code to query the DB using the term sent by the user
///   - SearchService, will have a method search(term) -> select from posts where title like %term%
//    - probably start with an empty list, then query the DB
// 4 Create/reuse a template to loop over the result of the search
//    public String search(@PathVariable String term) {
//     return 'post/index';  // instead of 'posts/search-result'
//    }

// Dependency injection
// 1. Constructor injection (preferred) -> required dependencies
// 2. Setter injection -> optional dependencies

@Controller
public class PostsController {
    // 1. Create an instance variable with your dependency
    private final PostService postService;

    private PostRepository postDao;

    public PostsController(PostService postService, PostRepository postDao) {
        this.postService = postService;
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String index(Model viewAndModel) {

        viewAndModel.addAttribute("posts", postDao.findAll());

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model viewAndModel) {
        Post post = postService.findOne(id);
        viewAndModel.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("posts/new")
    // to catch the form
    public String showCreatePostForm(Model viewAndModel){
        Post post = new Post();
        viewAndModel.addAttribute("post", post);
        return "posts/new";
    }

    @PostMapping("posts/create")
    @ResponseBody
    // we are not using pathvariable here because is coming from a form
    public String savePost(@ModelAttribute Post post){
        postService.save(post);
        return post.getTitle() + " " + post.getBody();
    }

    @GetMapping("posts/{id}/edit")
    public String showEditForm(@PathVariable long id, Model viewAndModel){
        Post post = postService.findOne(id);
        viewAndModel.addAttribute("post", post);
        return "/posts/edit";
    }

    @GetMapping("posts/{id}/delete")
    public String deletePost(@PathVariable long id, Model viewAndModel){
        postService.delete(id);
        return "redirect:/posts";
    }


    @PostMapping("posts/edit")
    public String updatePost(@ModelAttribute Post post){
        postService.update(post);
        return "redirect:/posts";
    }
}