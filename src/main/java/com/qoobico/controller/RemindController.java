package com.qoobico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/remind")
public class RemindController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    /**
     * Как обратиться к методу
     * ResponseBody-то,что ты вернешь
     */
    public @ResponseBody String getReminder(ModelMap modelMap){
        return "Hello reminder";
    }
}
