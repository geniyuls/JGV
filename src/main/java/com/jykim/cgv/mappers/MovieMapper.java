package com.jykim.cgv.mappers;

import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;

@Mapper
public interface MovieMapper {
 int insertMovieMapper(MovieMapper movie);

}
