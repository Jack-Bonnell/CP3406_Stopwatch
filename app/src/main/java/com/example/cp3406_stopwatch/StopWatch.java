package com.example.cp3406_stopwatch;

import androidx.annotation.NonNull;

import java.util.Locale;

public class StopWatch {
    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    public void tick() {
        if (seconds < 59) {
            seconds++;
        } else if (minutes <59) {
            seconds = 0;
            minutes++;
        } else if (hours <59) {
            seconds = 0;
            minutes = 0;
            hours++;
        }

    }
    @NonNull
    @Override
    public String toString() {
        return String.format(Locale.getDefault(),"%02d:%02d:%02d", hours, minutes, seconds);
    }

}
