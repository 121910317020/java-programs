package arrays;

import java.util.HashSet;
import java.util.Set;

public class duplicateele {
    public static void main (String[] args)
    {
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
        int n = arr.length;
        /*Set set = new HashSet();
        for (int i=0; i<n; i++)
            set.add(arr[i]);
        System.out.print(set);*/
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i] == arr[j]){
                    count = count+1;
                }
            }
            if(count>1){
                System.out.println(arr[i]);
            }

        }
    }
}
