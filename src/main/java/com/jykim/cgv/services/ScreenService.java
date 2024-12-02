package com.jykim.cgv.services;


import com.jykim.cgv.entities.CinemaTypeEntity;
import com.jykim.cgv.entities.ScreenEntity;
import com.jykim.cgv.entities.TheaterEntity;
import com.jykim.cgv.mappers.ScreenMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ScreenService {
    private final ScreenMapper screenMapper;

    public ScreenEntity getScreen(int scNum) {
        return this.screenMapper.selectScreenTypeScNum(scNum);
    }
}