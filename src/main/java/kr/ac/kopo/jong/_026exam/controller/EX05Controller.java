package kr.ac.kopo.jong._026exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/home")
public class EX05Controller {
    @GetMapping("exam05")
    public String requestMethod(){
        return "view05";
    }
}
