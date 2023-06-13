package com.example.learnthymeleaf;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    
    @RequestMapping("/test")
    public String test(Model model) {
        MyBeanClass beanClass = new MyBeanClass();
        beanClass.setName("IT wala");
        beanClass.setAdmin(false);
        model.addAttribute("attr", beanClass);

        var list  = List.of("a", "b", "c", "d", "e");
        model.addAttribute("list", list);
        return "test.html";
    }
}
