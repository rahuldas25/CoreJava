package com.java.CoreJava.ArrayImpl.basic;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] a={ 0, -1, 2, -3, 1 };int target=-2;
        Set<Integer> s=new HashSet<>();
        for (int j=0;j<a.length;j++) {
            int comp = target - a[j];

            if (s.contains(comp)) {
                System.out.println("true");
                break;
            }
            s.add(a[j]);
        }
        System.out.println("false");;

        //return null;
    }
}
