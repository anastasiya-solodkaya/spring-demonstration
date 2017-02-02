package com.levelp.spring.controller;

import com.levelp.spring.dto.RegistrationUserDTO;
import com.levelp.spring.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Anastasiya Solodkaya.
 */
@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @RequestMapping(name = "/register", method = RequestMethod.GET)
    public ModelAndView register(){
        ModelAndView view = new ModelAndView("registration_form");
        view.getModelMap().addAttribute("user", new RegistrationUserDTO());
        return view;
    }

    @RequestMapping(name = "/registeruser", method = RequestMethod.POST)
    public ModelAndView registerUser(@ModelAttribute RegistrationUserDTO user){
        service.register(user);
        return new ModelAndView("redirect:list");
    }
}
