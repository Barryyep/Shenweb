package com.shen.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class WebController {
    @Controller
    public class classWebController
    {
        @ResponseBody
        @RequestMapping("/hello")
        public String hello()
        {
            return "hello world";
        }

    }
}
