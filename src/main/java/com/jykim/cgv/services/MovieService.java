package com.jykim.cgv.services;

import com.jykim.cgv.entities.MovieEntity;
import com.jykim.cgv.entities.ScreenEntity;
import com.jykim.cgv.mappers.MovieMapper;
import com.jykim.cgv.mappers.ScreenMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieMapper movieMapper;

    public MovieEntity getMovie(int moNum) {
        return this.movieMapper.selectMovieByMoNum(moNum);
    }
}
