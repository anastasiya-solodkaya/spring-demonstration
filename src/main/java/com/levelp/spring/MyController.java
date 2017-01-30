package com.levelp.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Anastasiya Solodkaya.
 */
@Controller
public class MyController {

    final SimpleDBAccess access;

    @Autowired
    public MyController(SimpleDBAccess access) {
        this.access = access;
    }

    @RequestMapping(value = "/hello")
    public String hello(ModelMap map){
        map.addAttribute("db", access.getVersion());
        return "index";
    }
}
