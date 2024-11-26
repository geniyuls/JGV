package com.jykim.cgv.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@EqualsAndHashCode(of={"moNum"})
public class MovieEntity {
    private int moNum;
    private String moTitle;
    private LocalDate moDate;
    private int moTime;
    private String moPlot;
    private float moBookingRate;
    private LocalDate moEnding;
}
