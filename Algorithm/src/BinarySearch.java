import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        // 二分查找的前提是数组是有序的！
        int[] arr = {7,23,79,81,103,127,131,147};

        int index = Search(arr,103);
        if(index == -1) {
            System.out.println("该元素不在数组中");
        }else{
            System.out.println(index);
        }

        // sun公司Arrays这个API中自带的二分查找算法
        int index1 = Arrays.binarySearch(arr,127);
        System.out.println(index1);
    }
    public static int Search(int[] arr , int data){
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid = (left + right) / 2;
            if(data < arr[mid]){
                right = mid - 1;
            }else if(data > arr[mid]){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }


}
