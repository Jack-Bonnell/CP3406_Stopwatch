package com.example.cp3406_stopwatch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class StopwatchTests {
    @Test
    public void testConstructor(){
        StopWatch stopwatch = new StopWatch();

        assertEquals("00:00:00",stopwatch.toString());

    }
    @Test
    public void testTicker(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.tick();
        assertEquals("00:00:01", stopWatch.toString());

        for (int i = 0; i<59; ++i) {
            stopWatch.tick();
        }
        assertEquals("00:01:00", stopWatch.toString());
        for (int i = 0; i<59*60; ++i) {
            stopWatch.tick();
        }
        assertEquals("01:00:00", stopWatch.toString());
    }
}