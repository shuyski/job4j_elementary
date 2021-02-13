package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorialFive() {
        assertThat(120, is(Factorial.calc(5)));
    }

    @Test
    public void factorialSeven() {
        assertThat(5040, is(Factorial.calc(7)));
    }

    @Test
    public void factorialTen() {
        assertThat(3628800, is(Factorial.calc(10)));
    }
}