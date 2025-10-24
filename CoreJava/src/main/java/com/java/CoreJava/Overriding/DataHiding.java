package com.java.CoreJava.Overriding;

import ch.qos.logback.core.net.SyslogOutputStream;

public class DataHiding {
    public static void main(String[] args) {
        Shape4 s1=new Shape4();
        Shape4 s2=new Triangle4();
        Triangle4 s3=new Triangle4();

        s1.printShape();
        s2.printShape();
        s3.printShape();
    }
}
class Shape4{
    public static void printShape(){
        System.out.println("Default shape!");
    }
}
class Triangle4 extends Shape4{
    //@Override   static method can not the overriding
    public static void printShape(){
        System.out.println("Triangle shape");
    }
}
