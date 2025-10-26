package com.java.CoreJava.ArrayImpl.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToHashSet {
    public static void main(String[] args) {
        Integer[] a=new Integer[]{25,12,40,13,13};

        Set<Integer> s=new HashSet<>();

        //by Iteration
        for(Integer i:a){
            s.add(i);
        }
        System.out.println("By Iterative Method\n"+s);

        //by Constructor
        Set<Integer> s2=new HashSet<>(Arrays.asList(a));
        System.out.println("By using constructor\n"+s2);

        // By Java Stream
        Set<Integer> s3=new LinkedHashSet<>();
        s3=Arrays.stream(a).collect(Collectors.toSet());
        System.out.println("By Java Stream\n"+s3);
    }
}
