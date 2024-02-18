import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int a = sc.nextInt();
        int sum = 0;
        while(a != 0){
            sum = sum+(a%10);
            a = a/10;
        }
        System.out.println("sum is " +sum);

    }
}
