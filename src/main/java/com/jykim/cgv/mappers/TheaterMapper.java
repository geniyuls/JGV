package com.jykim.cgv.mappers;

import com.jykim.cgv.entities.TheaterEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TheaterMapper {
    int insertTheater(TheaterEntity theater);

    TheaterEntity selectTheaterByThNum(int thNum);
}
