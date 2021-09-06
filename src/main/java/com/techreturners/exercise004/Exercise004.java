package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.lang.Math.*;

public class Exercise004 {

    final private LocalDateTime startDateTime;

    public Exercise004(LocalDate date) {
        startDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        startDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return startDateTime.plusSeconds((long) pow(10, 9));
    }
}
