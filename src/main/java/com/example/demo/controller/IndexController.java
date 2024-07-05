package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

@Controller
@RequestMapping("/")
public class IndexController {


@GetMapping("/add")
public ModelAndView requestMethodName() {
    ModelAndView md=new ModelAndView("index");
    md.addObject("message","Haii");
    return md;
}


}