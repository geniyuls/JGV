package com.jykim.cgv.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(of = {"ciNum"})
public class CinemaEntity {
private int ciNum;
private String ciName;
private int thNum;
private int citNum;
}
