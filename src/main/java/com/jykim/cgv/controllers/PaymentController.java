package com.jykim.cgv.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/payment")
public class PaymentController {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getPayment() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jgv/payment");
        return modelAndView;
    }
}
