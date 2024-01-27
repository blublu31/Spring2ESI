package fr.limayrac.Projet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // This assumes you have an "index.html" file in the "templates" folder
    }
}
