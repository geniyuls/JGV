package com.jykim.cgv.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@EqualsAndHashCode(of = {"scNum"})
public class ScreenEntity {
private int scNum;
private LocalDateTime scStart;
private int moNum;
private int ciNum;
}
