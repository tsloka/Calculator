package com.kodilla;

public class KodillaCourseApplication {
    public static void main(String[] args) {

        Calculator simpleCalculator = new Calculator(9, 15);
        System.out.println("Addition of " + simpleCalculator.a + " and " + simpleCalculator.b + " gives: " + simpleCalculator.addAtoB());
        System.out.println("Substraction of " + simpleCalculator.b + " from " + simpleCalculator.a + " gives: " + simpleCalculator.subtractBfromA());
    }
}
class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addAtoB() {
        return a + b;
    }

    public int subtractBfromA() {
        return a - b;
    }
}