package by.tms.springbootuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String req(Model model) {
        return "req";
    }

    @GetMapping("/auth")
    public String auth(Model model) {
        return "auth";
    }

}
