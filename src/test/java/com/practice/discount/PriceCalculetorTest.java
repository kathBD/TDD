package com.practice.discount;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

public class PriceCalculetorTest {

    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculetor calculetor = new PriceCalculetor();
        assertThat(calculetor.getTotal(), is(0.0));
    }

    @Test
    public void total_is_sum_of_prices() {
        PriceCalculetor calculetor = new PriceCalculetor();
        calculetor.addPrice(10.15);
        calculetor.addPrice(15.0);

        assertThat(calculetor.getTotal(), is(0.0));
    }


}