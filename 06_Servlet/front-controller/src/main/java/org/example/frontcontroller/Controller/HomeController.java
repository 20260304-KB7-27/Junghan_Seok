package org.example.frontcontroller.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//
public class HomeController {
    // Service
    public String getIndex(HttpServletRequest request, HttpServletResponse response) {

        // service.###()
        // 비즈니스 로직 작성되는곳

        return "index";
    }
}
