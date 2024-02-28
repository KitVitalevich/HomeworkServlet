package com.babiy.homeworkservlet;

public class ActionNumber {

    public double max(double numberA, double numberB, double numberC) {
        double result = Math.max(numberA, Math.max(numberB, numberC));
        return result;
    }

    public double min(double numberA, double numberB, double numberC) {
        double result = Math.min(numberA, Math.min(numberB, numberC));
        return result;
    }

    public double middle(double numberA, double numberB, double numberC) {
        double result = (numberA + numberB + numberC) / 3;
        return result;
    }

}
