package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.lang.Math.*;

public class Exercise004 {

    private LocalDateTime StartDateTime;

    public Exercise004(LocalDate date) {
        StartDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        StartDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return StartDateTime.plusSeconds((long) pow(10, 9));
    }
}
