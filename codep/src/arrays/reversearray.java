package arrays;

import java.util.Scanner;

public class reversearray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do u want");
        int n = sc.nextInt();
        int[] array = new int[10];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(array[i]+",");
        }
    }
}
