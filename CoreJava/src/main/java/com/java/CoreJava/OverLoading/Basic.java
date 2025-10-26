package com.java.CoreJava.OverLoading;

//when class is having multiple method with same name but different parameters
//Either numbers of parameters different or type of parameters different.
//this is static binding as JVM will decide which method to be called at compile time.
//also known "static binding","Compile time polymorphism"
public class Basic {

    public static void method1(int i) {
        System.out.println("printing int type "+i);
    }

    public static void method1(Integer i) {
        System.out.println("printing Integer type "+i);
    }

    public static void method1(String s) {
        System.out.println("printing String type "+s);
    }

    public static void method1(String s,int i) {
        System.out.println("printing String type "+s.concat(""+i*10));
    }

    public static void main(String[] args) {
        method1(10);
       // method1(new Integer(20));
        method1("20");
        method1("20",10);
    }

}