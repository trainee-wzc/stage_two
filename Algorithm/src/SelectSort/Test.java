package SelectSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 选择排序
        int[] arr = {10,1,2,5,13,9,8};
        for (int i = 0; i < arr.length-1; i++) {
            int minindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            if (minindex != i){
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
