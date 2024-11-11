package com.example.SpringWebDemo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Controller2 {

    @GetMapping ("/hello")
    public String hello (String username // параметр который идет из строки запроса их может быть много
                , Model modelka                         //  это  словарь или  ассоциативным массивом,  в кот. можно дабавлять атрибуты для передачив шаблон
    ){
        System.out.println("metod hello");
        modelka.addAttribute("x", username);
               return "hello"; //название ШАБОЛНА
    }
}
