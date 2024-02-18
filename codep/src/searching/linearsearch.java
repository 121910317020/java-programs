package searching;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,23,45,7,88,9,24,55};
        System.out.println("enter the search element : ");
        int searchvar = sc.nextInt();
        int n =arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == searchvar){
                System.out.println("element found at index " + i);
                count =1;
                break;
            }
        }
        if(count !=1){
            System.out.println("element not found");
        }
    }
}
