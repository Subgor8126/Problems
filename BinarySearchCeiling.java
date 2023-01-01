package com.company;

public class BinarySearchCeiling {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,10,14,17};
        int target = 12;
        int ans = binsearchceil(arr, target);
        System.out.println(ans);
        System.out.println("printed");
    }
    static int binsearchceil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                return arr[mid];
            }

        }
        if (target>=arr.length-1){
            return -1;
        }
        else{
            // here we return start because if the element is not found in the array
            // it means that the condition of the while loop is violated
            // and start is actually ahead of the mid element, because start will
            // be greater than end.
            return arr[start];
        }
    }
}
