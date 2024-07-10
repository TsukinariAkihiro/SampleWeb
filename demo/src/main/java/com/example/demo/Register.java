package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {

    @RequestMapping("/")
    public String start(){
        return "input";
    }

    @RequestMapping("/register")
    //「RegisterBean」クラスを呼んでいる。
    public ModelAndView register(@ModelAttribute RegisterBean rb,ModelAndView m){
        m.addObject("rb", rb);
        m.setViewName("register");
        return m;
    }

}
