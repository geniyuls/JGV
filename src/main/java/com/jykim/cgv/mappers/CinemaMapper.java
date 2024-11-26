package com.jykim.cgv.mappers;

import com.jykim.cgv.entities.CinemaEntity;
import com.jykim.cgv.entities.ScreenEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CinemaMapper {
    int insertCinema(CinemaEntity cinema);

    CinemaEntity selectCinemaByCiNum(@Param("ciNum") int ciNum);
}
