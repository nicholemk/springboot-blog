package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

    @Controller
    public class HomeController {

        private PostRepository postDao;

        public HomeController(PostRepository postDao) {

            this.postDao = postDao;
        }


        @GetMapping("/")

        public String index() {

            return "home";
        }

        @GetMapping("/dao-test")
        @ResponseBody
        public Iterable<Post> daoTest() {

//            iterable
//        }

//            Post post = new Post("title C", "description C");

//        postDao.save(post);

            postDao.

            return postDao.findAll();
        }

    }