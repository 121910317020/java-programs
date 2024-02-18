import java.util.Scanner;

public class primenum {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int a = sc.nextInt();
        prime(a);
    }
    public static void prime(int a){
        int count = 0;
        if(a<2){
            System.out.println("not prime");
        }
        else{
            for(int i=1;i<=a;i++){
                if(a%i ==0){
                    count= count+1;
                }
            }
            if(count>2){
                System.out.println("not prime");
            }
            else {
                System.out.println("prime");
            }
        }
    }
}
