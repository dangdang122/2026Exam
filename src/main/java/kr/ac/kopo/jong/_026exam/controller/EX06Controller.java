package kr.ac.kopo.jong._026exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EX06Controller {
//    @GetMapping("/exam06")
//    public String requestMethod(Model model){
//        model.addAttribute("title1", "Model 유형연습1");
//        model.addAttribute("title2", "첫번째");
//        return "viewPage";
//    }
    @GetMapping("/exam06")
    public String requestMethod(Model model){
        model.addAttribute("title1", "Model 유형연습1");
        model.addAttribute("title2", "두번째");

        return "view06";
    }
}
