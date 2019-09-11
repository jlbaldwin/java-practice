package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] searchArr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] searchArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] searchArr3 = {2,3};
        int [] searchArr4 = {2,2};
        int [] searchArr5 = {4};
        int [] searchArr6 = {};

        int [][] searchArrays = {searchArr1, searchArr2, searchArr3, searchArr4, searchArr5, searchArr6};
        int [] searchValues = {0, 2, 4, 5, 6, 10};

        for(int i = 0; i < searchArrays.length; i++) {
            for(int j = 0; j < searchValues.length; j++) {
                boolean result = BinarySearch.binarySearch(searchArrays[i], searchValues[j]);
                System.out.println("Array: " + Arrays.toString(searchArrays[i]) +
                                   " search value: " + searchValues[j] + " : " + result);
            }
        }
    }
}
