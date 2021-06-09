package com.company;

public class Main {

    public static void main(String[] args) {
	    ComplexNumber one = new ComplexNumber(1.0,1.0);
	    ComplexNumber number = new ComplexNumber(2.5, -1.5);
	    one.add(1,1);
        System.out.println("Real No. is " + one.getReal() + " Imaginary No. is " + one.getImaginary());
        one.subtract(number);
        System.out.println("Real No. is " + one.getReal() + " Imaginary No. is " + one.getImaginary());
        number.subtract(one);
        System.out.println("Real No. is " + number.getReal() + " Imaginary No. is " + number.getImaginary());

    }
}
