package com.practice.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void password_when_less_8_letter() {

       assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("123aass"));

    }
    @Test
    public void password_when_less_only_letter() {

        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefgtyuyi"));

    }

    @Test
    public void password_medium_when_letters_and_number() {

        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcjhff12345"));

    }

    @Test
    public void password_strong_when_letters_number_and_simbol() {

        assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("tyuuabc12345*$"));

    }

}