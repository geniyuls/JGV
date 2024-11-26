package com.jykim.cgv.services;

import com.jykim.cgv.entities.CinemaEntity;
import com.jykim.cgv.entities.CinemaTypeEntity;
import com.jykim.cgv.entities.TheaterEntity;
import com.jykim.cgv.mappers.CinemaMapper;
import com.jykim.cgv.mappers.CinemaTypeMapper;
import com.jykim.cgv.mappers.TheaterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CinemaService {
    private final CinemaMapper cinemaMapper;
    private final CinemaTypeMapper cinemaTypeMapper;
    private final TheaterMapper theaterMapper;

    public CinemaEntity getCinema(int ciNum) {
        return this.cinemaMapper.selectCinemaByCiNum(ciNum);
    }
    public CinemaTypeEntity getCinemaType(int CitNum) {
        return this.cinemaTypeMapper.selectCinemaTypeByCitNum(CitNum);
    }
    public TheaterEntity getTheater(int thNum) {
        return this.theaterMapper.selectTheaterByThNum(thNum);
    }
}
