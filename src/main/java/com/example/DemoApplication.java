package com.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@SpringBootApplication
@RestController
public class DemoApplication {
    private static Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private HttpServletRequest context;
	
	@RequestMapping(value = "/AppealAssistant")
	public List<String> available() {

        log.info("Time - " + Calendar.getInstance().getTime());
        System.out.println((String.format("%s request to %s", context.getMethod(), context.getRequestURL().toString())));
        List<String> list = new ArrayList<>();
        list.add("AppealAssistant Response List - 1");
        list.add("AppealAssistant Response List - 2");
		return list;
	}
    
	@RequestMapping(value = "/User")
    public @ResponseBody User getAllEmployees() 
    {
        log.info("Time - " + Calendar.getInstance().getTime());

        User user = new User(1,"Vishwesh","H","vishwesh.h@cqent.biz", "AppealAssistant", true, "BIL7446");
        
        return user;
    }
	
	public static void main(String[] args) {
		System.out.println("------------------------------------------------DEMO MAIN--------------------------------");
		System.out.println("------------------------------------------------DEMO MAIN--------------------------------");
		SpringApplication.run(DemoApplication.class, args);
	}
}
