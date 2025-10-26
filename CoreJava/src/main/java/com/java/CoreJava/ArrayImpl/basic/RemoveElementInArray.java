package com.java.CoreJava.ArrayImpl.basic;

import java.util.Arrays;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,9};
        int [] another=new int[a.length-1];
        //k-th index
        int indx=3;
        for(int i=0,k=0;i<a.length;i++){
            if (i==indx){
                continue;
            }
            another[k++]=a[i];
        }
        System.out.println(Arrays.toString(another));
    }
}
