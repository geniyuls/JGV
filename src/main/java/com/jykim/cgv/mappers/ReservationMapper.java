package com.jykim.cgv.mappers;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationMapper {
    int insertReservation (ReservationMapper reservation);
}
