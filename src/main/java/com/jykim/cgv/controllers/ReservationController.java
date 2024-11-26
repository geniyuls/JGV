package com.jykim.cgv.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "/")
public class ReservationController {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView getReservation() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ticket/index");
        return modelAndView;
    }
}
