package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDay1() {
        int nomer = MultipleSwitchWeek.numberOfDay("Понедельник");
        assertThat(nomer, is(1));
    }
    @Test
    public void numberOfDay3() {
        int nomer = MultipleSwitchWeek.numberOfDay("Wednesday");
        assertThat(nomer, is(3));
    }
    @Test
    public void numberOfDay7() {
        int nomer = MultipleSwitchWeek.numberOfDay("Sunday");
        assertThat(nomer, is(7));
    }
    @Test
    public void numberOfDay0() {
        int nomer = MultipleSwitchWeek.numberOfDay("Неделя");
        assertThat(nomer, is(-1));
    }
}