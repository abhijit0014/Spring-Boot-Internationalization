package com.spring.demo.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	
	@Autowired
	private MessageSource messageSource;
    @GetMapping("/test-internationalization")
    public String internationalization (@RequestHeader(name="Accept-Language") Locale locale){
        return messageSource.getMessage("good.morning.msg", null, locale);
    }
}
