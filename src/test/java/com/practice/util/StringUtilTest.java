package com.practice.util;


import org.junit.Assert;
import org.junit.Test;

public  class StringUtilTest {

    @Test
    public void  testRepeatOne(){
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));


    }
    @Test
    public void  testRepeat(){

        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));

    }

    @Test
    public void  testRepeatZero(){

        Assert.assertEquals("", StringUtil.repeat("hola", 0));

    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
       StringUtil.repeat( "hola", -1);

    }

}