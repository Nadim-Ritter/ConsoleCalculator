/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.consolecalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NadimRitter
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    Calculator instance;

    /**
     * Test of addition method, of class Calculator.
     */

    //addition tests
    @Test
    public void testNormalAddition1() {
        instance = new Calculator();
        assertEquals(320, instance.addition(100, 220));
    }
    
    @Test
    public void testNormalAddition2() {
        instance = new Calculator();
        assertEquals(300, instance.addition(200, 100));
    }
    
    @Test
    public void testNegativeAddition1() {
        instance = new Calculator();
        assertEquals(100, instance.addition(200, -100));
    }
    
    @Test
    public void testNegativeAddition2() {
        instance = new Calculator();
        assertEquals(-100, instance.addition(-200, 100));
    }
    
    @Test
    public void testNegativeAddition3() {
        instance = new Calculator();
        assertEquals(-300, instance.addition(-200, -100));
    }
    
    @Test(expected=AssertionError.class)
    public void testMaxValueAddition() {
        instance = new Calculator();
        assertEquals(Integer.MAX_VALUE, instance.addition(Integer.MAX_VALUE, 500));
    }
    
    @Test(expected=AssertionError.class)
    public void testMinValueAddition() {
        instance = new Calculator();
        assertEquals(Integer.MIN_VALUE, instance.addition(Integer.MIN_VALUE, -100));
    }
    
    @Test
    public void testZeroAddition() {
        instance = new Calculator();
        assertEquals(0, instance.addition(0, 0));
    }
    
    
    //subtraction tests
    @Test
    public void testNormalSubtraction1() {
        instance = new Calculator();
        assertEquals(100, instance.subtraction(200, 100));
    }
    
    @Test
    public void testNormalSubtraction2() {
        instance = new Calculator();
        assertEquals(-100, instance.subtraction(100, 200));
    }
    
    @Test
    public void testNegativeSubtraction1() {
        instance = new Calculator();
        assertEquals(300, instance.subtraction(200, -100));
    }
    
    @Test
    public void testNegativeSubtraction2() {
        instance = new Calculator();
        assertEquals(-300, instance.subtraction(-200, 100));
    }   
    
    @Test
    public void testNegativeSubtraction3() {
        instance = new Calculator();
        assertEquals(-100, instance.subtraction(-200, -100));
    }
    
    @Test(expected=AssertionError.class)
    public void testMaxValueSubtraction() {
        instance = new Calculator();
        assertEquals(2147483637, instance.subtraction(Integer.MAX_VALUE, -500));
    }
    
    @Test(expected=AssertionError.class)
    public void testMinValueSubtraction() {
        instance = new Calculator();
        assertEquals(302, instance.subtraction(Integer.MIN_VALUE, 00));
    }
    
    @Test
    public void testZeroSubtraction() {
        instance = new Calculator();
        assertEquals(0, 0);
    }
    
    //division tests
    @Test
    public void testNormalDiv1() {
        instance = new Calculator();
        assertEquals(10, instance.division(300, 30));
    }
    
    @Test
    public void testNormalDiv2() {
        instance = new Calculator();
        assertEquals(6, instance.division(600, 100));
    }
    
    @Test
    public void testNormalDiv3() {
        instance = new Calculator();
        assertEquals(0, instance.division(60, 100));
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDivByZero() {
        instance = new Calculator();
        assertEquals(0, instance.division(100, 0));
    }
    
    @Test
    public void testDivNegative() {
        instance = new Calculator();
        assertEquals(-4, instance.division(200, -50));
    }
    
    @Test
    public void testDivPositve() {
        instance = new Calculator();
        assertEquals(-4, instance.division(-200, 50));
    }
    
    @Test
    public void testDivNegative2() {
        instance = new Calculator();
        assertEquals(4, instance.division(-200, -50));
    }
    
    @Test(expected=ArithmeticException.class)
    public void testDivByZero2() {
        instance = new Calculator();
        assertEquals(0, instance.division(0, 0));
    }
    
    //multiplication tests
    @Test
    public void testNormalMulti1() {
        instance = new Calculator();
        assertEquals(3000, instance.multiplication(100, 30));
    }
    
    @Test
    public void testNormalMulti2() {
        instance = new Calculator();
        assertEquals(3000, instance.multiplication(30, 100));
    }
    
    @Test
    public void testMultiZero1() {
        instance = new Calculator();
        assertEquals(0, instance.multiplication(100, 0));
    }
    
    @Test
    public void testMultiNegative1() {
        instance = new Calculator();
        assertEquals(-20000, instance.multiplication(100, -200));
    }
    
    @Test
    public void testMultiNegative2() {
        instance = new Calculator();
        assertEquals(20000, instance.multiplication(-100, -200));
    }

    @Test(expected=AssertionError.class)
    public void testMultiMaxValue() {
        instance = new Calculator();
        assertEquals(2*Integer.MAX_VALUE, instance.subtraction(Integer.MAX_VALUE, 2));
    }

    @Test(expected=AssertionError.class)
    public void testMultiMinValue() {
        instance = new Calculator();
        assertEquals(2*Integer.MIN_VALUE, instance.subtraction(-Integer.MIN_VALUE, 2));
    }

    @Test
    public void testMultiZero2() {
        instance = new Calculator();
        assertEquals(0, instance.subtraction(0, 0));
    }
    
  
}