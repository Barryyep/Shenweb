package com.shen.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.shen.webapp.WebController;

@SpringBootApplication
@RestController
public class ShenwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShenwebApplication.class, args);
    }

//    @Controller
//    public class classWebController
//    {
//        @ResponseBody
//        @RequestMapping("/hello")
//        public String hello()
//        {
//            return "hello world";
//        }
//
//    }

}
