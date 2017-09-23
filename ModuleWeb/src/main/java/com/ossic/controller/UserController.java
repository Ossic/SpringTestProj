package com.ossic.controller;

import com.ossic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="getNameById", method = RequestMethod.GET)
    public ModelAndView getNameById(@RequestParam(value = "id", required = false, defaultValue = "1") String idStr) {
        ModelAndView mv = new ModelAndView("success");
        String userName = userService.getUserNameById(Integer.parseInt(idStr));
        mv.addObject("name", userName);
        return mv;
    }

}
