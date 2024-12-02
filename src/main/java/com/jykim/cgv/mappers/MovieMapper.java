package com.jykim.cgv.mappers;

import com.jykim.cgv.entities.MovieEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MovieMapper {
 int insertMovieMapper(MovieMapper movie);

 MovieEntity selectMovieByMoNum(int MoNum);
}
