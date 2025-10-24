package com.java.CoreJava.Overriding;

public class InheritanceImpl {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.m1();
        p1.m2();

        System.out.println("-------------------------");
        child c1=new child();
        c1.m1();
        c1.m2();
        System.out.println("-------------------------");
        Parent p2=new child();
        p2.m1();
        p2.m2();
//		p2.m3(); //compilation error
    }
}
class Parent{
    public void m1(){
        System.out.println("m1:parent");
    }
    public void m2(){
        System.out.println("m2:parent");
    }
}
class child extends Parent{
    public void m1(){
        System.out.println("m1:child");
    }
    public void m2(){
        System.out.println("m2:child");
    }
}