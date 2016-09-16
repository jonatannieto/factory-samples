package com.telefonica.controllers;

import com.telefonica.services.HelloWorldFactory;
import com.telefonica.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 10/26/15.
 */
@Controller
public class GreetingControllerWithFactory {

    private HelloWorldFactory helloWorldFactory;
    private HelloWorldService helloWorldService;

    public GreetingControllerWithFactory(){
        //Para no usar new crearte un Bean e inyectarlo por constructor
        this.helloWorldFactory = new HelloWorldFactory();
    }

    public String sayHello(String language){
        this.helloWorldService = helloWorldFactory.createHelloWorldService(language);
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        return greeting;
    }

}
