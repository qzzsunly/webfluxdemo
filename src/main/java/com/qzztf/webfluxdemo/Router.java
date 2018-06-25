package com.qzztf.webfluxdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

/**
 * @author qzz
 */
@Configuration
public class Router {
    @Autowired private HelloWorldHandler helloWorldHandler;
    @Autowired private UserHandler userHandler;
    @Autowired private TimerHandler timeHandler;

    @Bean
    public RouterFunction<?> routerFunction(){
        return RouterFunctions.route(GET("/hello"), helloWorldHandler::helloWorld)
                .andRoute(RequestPredicates.POST("/register"), userHandler::register)
                .andRoute(RequestPredicates.POST("/login"), userHandler::login)
                .andRoute(GET("/times"), timeHandler::sendTimePerSec);
    }
}