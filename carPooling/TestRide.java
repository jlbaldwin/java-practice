/*
  leetcode 1094 - carpooling
  given trip[][] = [num_passengers, start, end] and int = capacity
  return bool if it's possible to make all trips in trip[][]
*/

package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class TestRide {

    public static Boolean possibleRide(int capacity, int[][] trips){

        //sort trips based on start (array index 1) position of ride
        int index = 1;
        Arrays.sort(trips, Comparator.comparingInt(arr -> arr[index]));

//        TESTING - display sorted array
//        for (int [] ride : trips) {
//            System.out.println("Entry is: " + Arrays.toString(ride));
//        }

        //populate summary array for increase and decrease in capacity
        int [] activeCapacity = new int[1001];
        for (int[] ride : trips) {
            activeCapacity[ride[1]] += ride[0];
            activeCapacity[ride[2]] -= ride[0];
        }

        //evaluate total anticipated riders, if greater than capacity, return false
        int capacityTest = 0;
        for (int c : activeCapacity) {
            capacityTest += c;
            if(capacityTest > capacity){
                return false;
            }
        }
        return true;
    }
}
