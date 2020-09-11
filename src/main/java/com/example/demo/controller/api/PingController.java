package com.example.demo.controller.api;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class PingController {

  private static final Logger log = LoggerFactory.getLogger(PingController.class);

  @GetMapping("/ping")
  public Map<String, String> ping() {

    log.info("ping => pong");

    Map<String, String> result = new HashMap<String, String>();
    result.put("message", "pong");
    
    return result;
  }

  // @GetMapping("/now")
  @RequestMapping(value = "/now", method = RequestMethod.GET)
  public Map<String, String> now() {

    log.info("now!!!");
    
    Map<String, String> result = new HashMap<String, String>();
    result.put("timestamp", LocalDateTime.now().toString());
    
    return result;
  }
}