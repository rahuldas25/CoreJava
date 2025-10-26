package com.java.CoreJava.ArrayImpl.basic;

public class SecondLargest {
    public static void main(String[] args) {
        int max=-1,sec_max=-1;
        int[] a={12,20,30,45,2};
        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        for (int j : a) {
            if (j > sec_max && j != max) {
                sec_max = j;
            }
        }
        System.out.println("max number in array\n"+max);
        System.out.println("second max number in array\n"+sec_max);
    }
}
