package sorting;

import java.util.Arrays;
//merge, quick,insertion
public class bubblesort {
    public  static  void main(String[] args){
        int a[] ={10,33,45,43,2,6,99,8,77};
        int n= a.length;
        for(int i=0;i<n-1;i++){
            int count =0;
            for(int j=0; j<n-1-i;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] =temp;
                    count =1;
                }
            }
            if(count==0){
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
    }
}
