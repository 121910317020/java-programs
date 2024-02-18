package sorting;

public class insertionsort {
    public static void main(String[] args){
        int a[] = {2,4,55,66,41,22,11,5,63,86};
        int n = a.length;
        for(int i=1;i<n;i++){
            int temp = a[i];
            int j=i-1;
            while(i>=0 && a[j] >temp){
                a[j+1] =a[j];
                j--;
            }
            a[j+1] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
    }
}
