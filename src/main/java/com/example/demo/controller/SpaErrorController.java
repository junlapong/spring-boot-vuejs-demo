package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SpaErrorController implements ErrorController {

    private static final Logger log = LoggerFactory.getLogger(SpaErrorController.class);

    @RequestMapping("/error")
    public Object error(HttpServletRequest request, HttpServletResponse response) {
        // place your additional code here (such as error logging...)
        log.warn("request URI not exists");

        if (request.getMethod().equalsIgnoreCase(HttpMethod.GET.name())) {
            response.setStatus(HttpStatus.OK.value()); // optional.
            return "forward:/index.html"; // forward to static SPA html resource.
        } else {
            return ResponseEntity.notFound().build(); // or your REST 404 blabla...
        }
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
