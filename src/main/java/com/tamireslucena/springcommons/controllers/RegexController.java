package com.tamireslucena.springcommons.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/regex")
public class RegexController {

    @GetMapping("/**")
    public String getRegex(){
        return "qualquer string";
    }

    @GetMapping("/t?st")
    public String getRegexTest(@RequestParam String teste){
        if(teste.matches("^J..a$")){
            return "deu match!";
        }
        return "xi...";
    }
}
