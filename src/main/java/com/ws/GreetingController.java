package com.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * Created by sivag on 11/4/17.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello %s!";
    private final AtomicInteger ai = new AtomicInteger();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name){
       return new Greeting(ai.incrementAndGet(),String.format(template,name),"sivakumargollu");
    }
}
