package searching;

import java.util.Arrays;
import java.util.Scanner;

public class   binarysearch {
    public static  void main(String[] args){
        int arr[] = {3,9,22,31,43,65,69,74,86,91,97};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter search variable");
        int searchvar =sc.nextInt();
        int index = binary(arr,searchvar);
        if(index != -1){
            System.out.println("element found at index :" +index);
        }
        else {
            System.out.println("element not found");
        }
    }
    public static int binary(int arr[],int searchvar){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(searchvar == arr[mid]){
                return mid;
            }
            else if(searchvar > arr[mid]){
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return -1;
    }
}
/*public class binarysearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;
        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If element is not found, return -1
        return -1;
    }
}*/
