package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpaErrorController {

    private static final Logger log = LoggerFactory.getLogger(SpaErrorController.class);

    // Forwards all routes to FrontEnd except: '/', '/index.html', '/api', '/api/**'
    // Required because of 'mode: history' usage in frontend routing, see README for further details
    @RequestMapping(value = "{_:^(?!index\\.html|api|static).*$}/**")
    public String redirectIndexPage() {
        log.info("URL entered directly into the Browser, so we need to redirect...");
        return "forward:/index.html";
    }
}
