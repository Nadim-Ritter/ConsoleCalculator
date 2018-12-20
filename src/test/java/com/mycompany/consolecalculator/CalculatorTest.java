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

    /**
     * Test of addition method, of class Calculator.
     */
    @org.junit.Test
    public void testAddition() {
        System.out.println("addition");
        int firstNumber = 10;
        int secondNumber = 20;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.addition(firstNumber, secondNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtraction method, of class Calculator.
     */
    @org.junit.Test
    public void testSubtraction() {
        System.out.println("subtraction");
        int firstNumber = 10;
        int secondNumber = 20;
        Calculator instance = new Calculator();
        int expResult = -10;
        int result = instance.subtraction(firstNumber, secondNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    
    
    
}
