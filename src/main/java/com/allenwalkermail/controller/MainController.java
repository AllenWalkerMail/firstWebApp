package com.allenwalkermail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Coypright (C),2017-2018,PENGZHOU
 * FileName: MainController
 * Author:   zhoupeng
 * Date:     2018/9/27 下午4:46
 * Description:
 * History:
 * <author>       <time>        <version>
 * 周鹏
 */

@Controller
public class MainController {

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
