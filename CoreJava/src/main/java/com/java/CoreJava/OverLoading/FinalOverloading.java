package com.java.CoreJava.OverLoading;

public class FinalOverloading {
    public static  int calc(int a, int b){
        return a*b;
    }
    public static  float calc(float a, float b, float c){
        return (int)a*b*c;
    }

    public static void main(String[] args) {

        System.out.println(calc(5,3));
        System.out.println(calc(5.0F, 6.2F, 7.0F));
    }
}

/*
static class not create any object ,direct call methods.
if I call final keyword then create object then call methods through object name.

 */