package com.example.gitstudy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
/**
* Some comments
*/
@Controller
@RequestMapping("")
public class IndexController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @RequestMapping("/msg")
    public String msg(Model model) {
        LocalDateTime now = LocalDateTime.now();
        // putting date time info to the model
        model.addAttribute("msg", now);
        //
        return "index";

    }
}
