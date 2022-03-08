package com.openclassrooms.magicgithub;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Chose {

    public static int carre(int i) {
        return i*i;
    }
    public static int racine(int i) {
        return (int) Math. sqrt(i);
    }
    public static int add(int a, int b) {
        return a + b;
    }

    @Test
    public void testCarre() {
        assertEquals("carre(5)=25", 25, Chose.carre( 5));
        assertEquals("carre(-2)=4",  4, Chose.carre(-2));
    }
    @Test
    public void testAdd() {
        assertEquals("add(5,3) = 8", 8, Chose.add( 5,3));
        assertEquals("add(-2,8) = 6",  6, Chose.add(-2,8));
    }

    @Test(expected=ArithmeticException.class)
    public void testRacineNegative()
    {
        float rac = racine(-2); // doit déclencher une exception

    }

}
