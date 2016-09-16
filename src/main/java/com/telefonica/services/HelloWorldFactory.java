package com.telefonica.services;

/**
 * Created by jt on 10/28/15.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language) {


        HelloWorldService helloWorldService = null;
        try {
            helloWorldService = (HelloWorldService) Class.
                    forName(this.getClass().getPackage().getName() +
                            ".HelloWorldService" + language + "Impl").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return helloWorldService;
    }
 }
