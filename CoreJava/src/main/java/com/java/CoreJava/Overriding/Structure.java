package com.java.CoreJava.Overriding;

public class Structure {
    void maxArea(){
        System.out.println("100sqft");
    }
}
class Triangle extends Structure{

    @Override
    void maxArea(){
        super.maxArea();
        System.out.println("200sqft");
    }
}
