package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int input[] = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    //

    @Test
    public void whenArrayHas25Then4() {
        int input[] = {5, 4, 3, 2, 25, 43, 12, 13};
        int value = 25;
        int result = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNoN() {
        int input[] = {5, 4, 3, 2, 25, 43, 12, 13};
        int value = 51;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}