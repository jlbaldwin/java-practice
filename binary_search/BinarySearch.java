package com.company;

public class BinarySearch {

    public static boolean binarySearch(int [] searchArr, int target){

        if(searchArr.length == 0) {
            return false;
        }
        else if (searchArr.length == 1){
            if(searchArr[0] == target) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            int low = 0;
            int high = searchArr.length;
            while(low < high){
                int mid = (low + high) / 2;
                if(searchArr[mid] == target) {
                    return true;
                }
                if(searchArr[mid] < target){
                    low = mid + 1;
                }
                else {
                    high = mid;
                }
            }
            return false;
        }
    }
}
