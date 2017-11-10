package com.eason.core.controller;

import com.eason.core.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feng yingsheng on 10/4/2017.
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @ResponseBody
    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(){
        indexService.indexService();
        return "--";
    }

    @ResponseBody
    @RequestMapping(value = "/init2", method = RequestMethod.GET, produces = {"application/json"})
    public String init2(){
        return "{\"a\":1}";
    }
}
