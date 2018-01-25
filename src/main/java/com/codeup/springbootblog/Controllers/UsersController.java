package com.codeup.springbootblog.Controllers;

import com.codeup.springbootblog.daos.UsersRepository;
import com.codeup.springbootblog.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {
    private UsersRepository usersRepository;
    private PasswordEncoder encoder;
}

public UsersController(UsersRepository usersRepository, PasswordEncoder encoder) {
    this.usersRepository = usersRepository;
    this.encoder = encoder;
}

@GetMapping("/users/sign-up")
public String showsSignUpForm(Model viewAndModel) {
    viewAndModel.addAttribute("user", new User());
    return "users/sign-up";
}

@PostMapping("/sign-up")
public String signUpNewUser(@ModelAttribute User user) {
    String hash = encoder.encode(user.getPassword());
    user.setPassword(hash);
    usersRepository.save(user);
    return "redirect:/login";
}
