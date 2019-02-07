package com.JJGS.HackDay.Controller;

import com.JJGS.HackDay.services.CrimeStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

    @Controller
public class HomeController {


        @Autowired
        private CrimeStatsService crimeStatsService;

        @RequestMapping("/")
        public String index(Model model) {
//            List<Post> latest3Posts = latest5Posts.stream().limit(3).collect(Collectors.toList());
//            model.addAttribute("latest3posts", latest3Posts);
            return "index";
        }
    }


