package com.jykim.cgv.controllers;

import com.jykim.cgv.entities.*;
import com.jykim.cgv.services.CinemaService;
import com.jykim.cgv.services.MovieService;
import com.jykim.cgv.services.ScreenService;
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
public class TicketController {
    private final CinemaService cinemaService;
    private final ScreenService screenService;
    private final MovieService movieService;


    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getIndex(
            @RequestParam(value = "ciNum", required = false, defaultValue = "1") int cinemaCiNum,
            @RequestParam(value = "citNum", required = false, defaultValue = "1")  int cinemaTypeCitNum,
            @RequestParam(value = "thName", required = false, defaultValue = "1")  int theaterThNum,
            @RequestParam(value = "ScNum", required = false, defaultValue = "1") int screenScNum,
            @RequestParam(value = "moNum", required = false, defaultValue = "1") int movieMoNum){

        CinemaEntity cinema = this.cinemaService.getCinema(cinemaCiNum);
        CinemaTypeEntity cinemaType = this.cinemaService.getCinemaType(cinemaTypeCitNum);
        TheaterEntity theater = this.cinemaService.getTheater(theaterThNum);
        ScreenEntity screen = this.screenService.getScreen(screenScNum);
        MovieEntity movie = this.movieService.getMovie(movieMoNum);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("cinema", cinema);
        modelAndView.addObject("cinemaType", cinemaType);
        modelAndView.addObject("theater", theater);
        modelAndView.addObject("Screen", screen);
        modelAndView.addObject("Movie", movie);
        modelAndView.setViewName("ticket/index");
        return modelAndView;
    }
}
