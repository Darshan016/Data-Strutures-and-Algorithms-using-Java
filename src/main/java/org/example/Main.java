package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] arr={1,2,3,4,5};
        System.out.println(Main.printArray(arr));

    }

    static String printArray(int[] arr){
        return Arrays.toString(arr);
    }
}