package com.java.CoreJava.ArrayImpl.basic;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a={10,32,20,12,10};
        int temp;
        for(int i=0;i<a.length/2;i++){
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}
