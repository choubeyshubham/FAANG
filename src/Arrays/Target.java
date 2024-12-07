package Arrays;

import java.util.Arrays;

public class Target {


    public static void main(String[] args) {
        int[] newArr = {1,3,7,9,2};
        int target=25;
        System.out.println(Arrays.toString(arrWithTarget(newArr,target)));
    }

    public static int[] arrWithTarget(int[] arr, int target) {
        int[] temp =new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]+arr[j] == target) {
                    temp = new int[]{arr[i ], arr[j]};

                }
            }
        }
        return temp;

    }


}
