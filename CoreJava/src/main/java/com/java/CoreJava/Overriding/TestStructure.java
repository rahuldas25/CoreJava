package com.java.CoreJava.Overriding;

public class TestStructure {
    public static void main(String[] args) {
        Structure s1=new Structure();
        Structure s2=new Triangle();
        Triangle s3=new Triangle();

        //s3.maxArea();   //200sqft
        //s1.maxArea(); //100sqft
        //s2.maxArea();   //200sqft

        // super keyword always print the super class. if I print super and base class method print both.

        s1.maxArea();
        s2.maxArea();
        s3.maxArea();
    }
}
