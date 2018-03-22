package com.eason.core.controller;

import com.eason.core.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author feng yingsheng on 10/4/2017.
 */
@RestController
@RequestMapping(value = "/index")
@Api("indexController相关api")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @ApiOperation("初始化方法")
    @ResponseBody
    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String init(){
        indexService.indexService();
        return "--";
    }

    @ApiIgnore
    @ResponseBody
    @RequestMapping(value = "/init2", method = RequestMethod.GET, produces = {"application/json"})
    public String init2(){
        return "{\"a\":1}";
    }

    @ApiIgnore
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String defaultM(){
        return "haha";
    }
}
