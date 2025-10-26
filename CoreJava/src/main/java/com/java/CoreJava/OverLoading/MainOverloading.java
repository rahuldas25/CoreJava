package com.java.CoreJava.OverLoading;

public class MainOverloading {

    //Normal Main
    public static void main(String[] args) {
        System.out.println("Hi(from main)");
        MainOverloading.main("Rahul");
        MainOverloading.main("web","dsa");
    }
    //main method overloading
    public static void main(String args1) {
        System.out.println("Hi "+args1);
        MainOverloading.main("Deer coders","practice coding");
    }

    public static void main(String args1,String args2) {
        System.out.println(args1+" with "+args2);
    }
}
