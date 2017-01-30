package com.levelp.spring.controller;

import com.levelp.spring.model.Idea;
import com.levelp.spring.service.IdeasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Random;

/**
 * @author Anastasiya Solodkaya.
 */
@Controller
public class MyController {

    @Autowired
    IdeasService service;

    @RequestMapping(value = "/hello")
    public String hello(ModelMap map){

        Idea idea = generateRandom();
        service.add(idea);
        List<Idea> list = service.list();

        map.addAttribute("list", list);
        return "index";
    }

    private Idea generateRandom() {
        Random random = new Random();
        Idea idea = new Idea();
        idea.setLikes(random.nextInt(100));
        idea.setDislikes(random.nextInt(100));
        idea.setCaption(generateString(random, 50));
        idea.setContent(generateString(random, 1000));
        return idea;
    }

    private String generateString(Random random, int max) {
        int length = random.nextInt(max - 10) + 10;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            s.append((char)(random.nextInt(26) + 97));

            if(i % 10 == 9){
                s.append(" ");
            }
        }

        return s.toString();
    }
}
