package arrays;

import java.util.Scanner;

public class sumofele {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do u want");
        int n = sc.nextInt();
        int[] array = new int[10];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0; i<array.length;i++){
            sum = sum+array[i];
        }
        System.out.println(sum);
    }
}
