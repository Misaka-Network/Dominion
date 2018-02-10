package com.misaka.network.dominion.web.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hyzhou.zhy. 2017/12/16.
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
}
