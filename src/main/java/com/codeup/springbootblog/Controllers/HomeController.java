package com.codeup.springbootblog.Controllers;

import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
    public class HomeController {

//        private PostRepository postDao;
//
//        public HomeController(PostRepository postDao) {
//
//            this.postDao = postDao;
//        }


        @GetMapping("/")

        public String index() {

            return "home";
        }

//        @GetMapping("/dao-test")
//        @ResponseBody
//        public Iterable<Post> daoTest() {
//        Iterable<Ad> ads = adDao.findAll();
//
//        for (Ad ad : ads) {
//            System.out.println("---");
//            System.out.println("  #" + ad.getId());
//            System.out.println("  title: " + ad.getTitle());
//            System.out.println("  description: " + ad.getDescription());
//        }

//        // we are hardcoding values for demonstration, in practice, these would come from a form
//        Ad ad = new Ad("title c", "description c");
//        adDao.save(ad);

//            return postDao.findæAll();
//        }


    }
