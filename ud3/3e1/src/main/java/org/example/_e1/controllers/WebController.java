package org.example._e1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class WebController {

    @GetMapping({})
    public String inicio(){
        return "principal";
    }
    @GetMapping("/galeria")
    public String galeria(){
        return "galeria";
    }
    @GetMapping("/destacados")
    public String destacados(){
        return "destacados";
    }

}
