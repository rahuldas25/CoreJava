package com.java.CoreJava.ArrayImpl.basic;

import org.springframework.aop.target.LazyInitTargetSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {


    public static void main(String[] args) {
        Integer[] a1=new Integer[]{5,9,10,7,3,1};

        List<Integer> arr=new ArrayList<>();
        arr= Arrays.asList(a1);
        System.out.println(arr);

        Integer [] a2=new Integer[arr.size()];

        a2 = arr.toArray(new Integer[0]);


        System.out.println(Arrays.deepToString(a2));



    }

}
