package com.chef_ben.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Binyamin Regev
 * Created by Binyamin Regev on 05-Feb-2018
 */
@Controller
public class HomeController {

   @RequestMapping(value = "/")
   public String home() {
      return "home";
   }
}
