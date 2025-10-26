package com.java.CoreJava.OverLoading;

public class ReturnTypeOverloading {
    public static int calc(int a,int b,int c){
        return a*b*c;
    }
    public static String calc(String a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(ReturnTypeOverloading.calc(2,1,3));
    //ReturnTypeOverloading.calc(10,10,"10"); will return compilation error,order of params must be same
    }
}
