package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2, 15, 21, 120};
        int[] result = Turn.back(input);
        int[] expect = new int[] {120, 21, 15, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }
}