package com.jykim.cgv.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(of = {"citNum"})
public class CinemaTypeEntity {
private int citNum;
private String citName;
private int citPrice;
}
