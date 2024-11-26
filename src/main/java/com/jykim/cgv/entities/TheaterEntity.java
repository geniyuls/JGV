package com.jykim.cgv.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class TheaterEntity {
    private int thNum;
    private String thName;
    private String thAddr;
}
