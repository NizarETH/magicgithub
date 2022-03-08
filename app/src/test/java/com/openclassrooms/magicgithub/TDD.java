package com.openclassrooms.magicgithub;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TDD {

    @Test
    public void testAdd2Numbers(){
        //ARRANGE
        int a = 3;
        int b = 2;

      /* Calculator calculator = new Calculator();
        //ACT
         int somme = calculator.add(a, b);

        //ASSERT
        assertEquals(5,somme);*/
    }
    @Test
    public void testSolveEquation(){
        //ARRANGE
        int a = 3;  // ax + b = 0
        int b = 2;

      /* Equation equat = new Equation();
        //ACT
         int result = Equation.solve(a, b);

        //ASSERT
        assertEquals(5,result);*/
    }
}