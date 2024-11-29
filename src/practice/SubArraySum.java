package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySum {
    /*
    Given an unsorted array arr containing only non-negative integers,
    your task is to find a continuous subarray (a contiguous sequence of elements)
     whose sum equals a specified value target.
     You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.
     */

    public static void main(String[] args) {
        int[] arr= {1,2,3,7,5};
        int target = 12;

        System.out.println(subarraySum(arr,target));


    }

    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    int[] ar=new int[]{arr[i],arr[j]};
                    list.add(ar[0]);
                    list.add(ar[1]);
                }
            }
        }


        return list;
    }
//    public static int[] subArraySum(int[] arr, int sum) {
//        int n = arr.length;
//        int[] result = new int[2];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    result = new int[]{arr[i],arr[j]};
//                }
//            }
//        }
//
//
//        return result;
//    }





}
