package kr.ac.kopo.jong._026exam.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/exam02", method = RequestMethod.GET)
public class EX02controller {
    public String requestMethod(){
        return "<h1>@RestControoler 연습중</h1>";
    }
}
