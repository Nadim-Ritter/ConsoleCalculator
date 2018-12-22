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

    
    @Test
    public void testNormalAddition1() {
        instance = new Calculator();
        assertEquals(320, instance.addition(100, 202));
    }
    
    @Test
    public void testNormalAddition2() {
        instance = new Calculator();
        assertEquals(300, instance.addition(200, 100));
    }
    
    @Test
    public void testNegativeAddition1() {
        instance = new Calculator();
        assertEquals(10, instance.addition(20, -10));
    }
    
    @Test
    public void testNegativeAddition2() {
        instance = new Calculator();
        assertEquals(-10, instance.addition(-20, 10));
    }
    
    @Test
    public void testNegativeAddition3() {
        instance = new Calculator();
        assertEquals(-30, instance.addition(-20, -10));
    }
    
    @Test(expected=AssertionError.class)
    public void testMaxValueAddition() {
        instance = new Calculator();
        assertEquals(Integer.MAX_VALUE, instance.addition(Integer.MAX_VALUE, 50));
    }
    
    @Test(expected=AssertionError.class)
    public void testMinValueAddition() {
        instance = new Calculator();
        assertEquals(Integer.MIN_VALUE, instance.addition(Integer.MIN_VALUE, -10));
    }
    
    @Test
    public void testZeroAddition() {
        instance = new Calculator();
        assertEquals(0, instance.addition(0, 0));
    }
    
    
    
    
    
    
}
