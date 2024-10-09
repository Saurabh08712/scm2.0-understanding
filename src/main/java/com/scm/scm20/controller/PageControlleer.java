package com.scm.scm20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControlleer {

    @RequestMapping("/home")
   public String home(){
     return "home";
   }
     //  about route
     @RequestMapping("/about")
      public String about(){
        return "about";
       }

      //  services route
      @RequestMapping("/services")
      public String services(){
         return "services";
         }
}
