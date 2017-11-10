package com.eason.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feng yingsheng on 10/4/2017.
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(){
        return "--";
    }

    @ResponseBody
    @RequestMapping(value = "/init2", method = RequestMethod.GET, produces = {"application/json"})
    public String init2(){
        return "{\"a\":1}";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String defaultM(){
        return "haha";
    }
}
