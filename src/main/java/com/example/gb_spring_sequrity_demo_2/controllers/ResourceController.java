package com.example.gb_spring_sequrity_demo_2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResourceController {
    /**
     * Домашняя страница.
     * @return представление домашней страницы.
     */
    @GetMapping("/")
    public String home(){
        return "home";
    }


    @GetMapping("/private-data")
    public String privateData() {
        return "private-data";
    }

    @GetMapping("/public-data")
    public String publicData() {
        return "public-data";
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Вернуть имя HTML страницы входа
    }
    /**
     * Страница отказа в доступе.
     * @return представление отказа в доступе.
     */
    @GetMapping("/access-denied")
    public String accessDenied(){
        return "access-denied";
    }

}