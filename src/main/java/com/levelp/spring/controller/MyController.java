package com.levelp.spring.controller;

import com.levelp.spring.model.Idea;
import com.levelp.spring.service.IdeasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Anastasiya Solodkaya.
 */
@Controller
public class MyController {

    @Autowired
    IdeasService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String hello(ModelMap map){
        List<Idea> list = service.list();
        map.addAttribute("list", list);
        return "index";
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createNewForm(){
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.getModelMap().addAttribute("newIdea", new Idea());
        return modelAndView;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public ModelAndView createNewAction(@ModelAttribute Idea newIdea){
        service.add(newIdea);
        return new ModelAndView("redirect:list");
    }
}
