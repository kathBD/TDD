package com.practice.discount;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

public class PriceCalculetorTest {

<<<<<<< HEAD
    private PriceCalculator calculator;
    @Test
    public void total_zero_when_there_are_prices() {
        calculator = new PriceCalculator();

        assertThat(calculator.getTotal(),is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        calculator = new PriceCalculator();

        // total de precios para indicar al calculator
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);

        assertThat(calculator.getTotal(),is(25.7));
    }

    @Test
    public void apply_discount_to_prices() {
        calculator = new PriceCalculator();

        // total de precios para indicar al calculator
        calculator.addPrice(12.5);
        calculator.addPrice(17.5);

        // aplicar descuento
        calculator.setDiscount(50);

        assertThat(calculator.getTotal(),is(15.0));
    }
=======
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


>>>>>>> origin/main
}