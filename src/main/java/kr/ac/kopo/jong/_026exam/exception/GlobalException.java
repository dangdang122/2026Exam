package kr.ac.kopo.jong._026exam.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = {"kr.ac.kopo.jong"})
public class GlobalException {
    @ExceptionHandler(RuntimeException.class)
    public String handlerException(UserException ex, Model model){
        model.addAttribute("data1", "GlobalException 처리 메시지입니다.");
        model.addAttribute("data2", ex);
        return "viewPage11_01";
    }
}