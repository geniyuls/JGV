package com.jykim.cgv.controllers;

import com.jykim.cgv.entities.CinemaEntity;
import com.jykim.cgv.entities.CinemaTypeEntity;
import com.jykim.cgv.entities.TheaterEntity;
import com.jykim.cgv.services.CinemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/ticket")
@RequiredArgsConstructor
public class SeatController {
    private final CinemaService cinemaService;


    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getIndex(
            @RequestParam(value = "ciNum", required = false, defaultValue = "1") int cinemaCiNum,
            @RequestParam(value = "citNum", required = false, defaultValue = "1")  int cinemaTypeCitNum,
            @RequestParam(value = "thName", required = false, defaultValue = "1")  int theaterThNum){

        CinemaEntity cinema = this.cinemaService.getCinema(cinemaCiNum);
        CinemaTypeEntity cinemaType = this.cinemaService.getCinemaType(cinemaTypeCitNum);
        TheaterEntity theater = this.cinemaService.getTheater(theaterThNum);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("cinema", cinema);
        modelAndView.addObject("cinemaType", cinemaType);
        modelAndView.addObject("theater", theater);
        modelAndView.setViewName("ticket/index");
        return modelAndView;
    }
}
