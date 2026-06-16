package org.scoula.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;
import javax.servlet.http.HttpServletRequest;
/*
전역처리를 하기 위한 어노테이션

 */
@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

    /*
    ExceptionHandler
    - Spring MVC에서 발생한 예외를 개발자가 직접 처리할 수  있게 Handler  메서드를 제공함.

    Spring이 예외를 처리하는 방식

    1. 컨트롤러 내부에서 처리하나 예외가 발생
    2. @ExceptionHandler를 Controller 안에서 찾음
        없다면 -> @ControllerAdvice가 붙은 클래스를 찾음 -> 내부의 ExceptionHandler 호출
     */

    // 모든 종류를 처리하는 핸들러 메서드

    @ExceptionHandler(Exception.class)
    public String except(Exception ex, Model model) {

        log.error("Exception ......." + ex.getMessage());
        model.addAttribute("exception", ex);
        log.error(model);
        return "error_page";
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handle404(NoHandlerFoundException ex, Model model, HttpServletRequest request){
        log.error(ex);
        model.addAttribute("uri", request.getRequestURI());
        return "custom404";
    }
}