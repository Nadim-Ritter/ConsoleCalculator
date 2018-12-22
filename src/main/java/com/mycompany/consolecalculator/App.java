package com.mycompany.consolecalculator;

public class App {
    
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        int firstNumber = 0;
        int secondNumber = 0;
        
        System.out.println("Console Calculator");
        System.out.println("==================");
        
        firstNumber = 100;
        secondNumber = 200;
        System.out.println("Summe: " + firstNumber + " + " + secondNumber + " = " + calculator.addition(firstNumber, secondNumber));
        System.out.println("Differenz: " + firstNumber + " - " + secondNumber + " = " + calculator.subtraction(firstNumber, secondNumber));
        System.out.println("Quotient: " + firstNumber + " / " + secondNumber + " = " + calculator.division(firstNumber, secondNumber));

        
    }
    
    
    
    

}
