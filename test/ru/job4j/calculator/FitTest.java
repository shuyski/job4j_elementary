package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whanMan180Than92() {
        short height = 180;
        double expected = 92;
        double man = Fit.manWeight(height);
        Assert.assertEquals(expected, man, 0.01);

    }

    @Test
    public void whanWoman180Than80_5() {
        short height = 180;
        double expected = 80.5;
        double man = Fit.womanWeight(height);
        Assert.assertEquals(expected, man, 0.01);
    }
}