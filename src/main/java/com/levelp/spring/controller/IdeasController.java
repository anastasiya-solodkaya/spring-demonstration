package com.levelp.spring.controller;

import com.levelp.spring.dto.IdeaDTO;
import com.levelp.spring.service.IdeasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Anastasiya Solodkaya.
 */
@Controller
public class IdeasController {

    @Autowired
    IdeasService service;

    @RequestMapping(value = {"/list", "/"}, method = RequestMethod.GET)
    public String list(ModelMap map){
        List<IdeaDTO> list = service.list();
        map.addAttribute("list", list);
        return "list";
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createNewForm(){
        ModelAndView modelAndView = new ModelAndView("addForm");
        modelAndView.getModelMap().addAttribute("newIdea", new IdeaDTO());
        return modelAndView;
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView createNewForm(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("updateForm");
        modelAndView.getModelMap().addAttribute("newIdea", service.get(id));
        return modelAndView;
    }

    @RequestMapping(value = "/submitNew", method = RequestMethod.POST)
    public ModelAndView createNewAction(@ModelAttribute IdeaDTO newIdea){
        service.add(newIdea);
        return new ModelAndView("redirect:list");
    }

    @RequestMapping(value = "/submitUpdate", method = RequestMethod.POST)
    public ModelAndView updateAction(@ModelAttribute IdeaDTO newIdea){
        service.update(newIdea);
        return new ModelAndView("redirect:list");
    }

    @RequestMapping(value = "/delete")
    public ModelAndView delete(@RequestParam int id){
        service.delete(id);
        return new ModelAndView("redirect:list");
    }
}
