package com.jykim.cgv.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(of = {"seNum"})
public class SeatEntity {
    private int seNum;
    private String seName;
    private int ciNum;
}
