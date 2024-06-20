package BubbleSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 冒泡排序：
        int[] arr = {10,1,2,5,13,9,8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
