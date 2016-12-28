package com.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    
	@RequestMapping(value = "/api/Authorizaton/IsAuthorized")
    public @ResponseBody Boolean getAuthorization(@RequestParam("lanId") String lanId, @RequestParam("applicationName") String applicationName) 
    {
        log.info("Time - " + Calendar.getInstance().getTime());
        Random random = new Random();
        Boolean result = random.nextBoolean();
        System.out.println("result @ " + result);
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("------------------------------------------------DEMO MAIN--------------------------------");
		System.out.println("------------------------------------------------DEMO MAIN--------------------------------");
		SpringApplication.run(DemoApplication.class, args);
	}
}
