import java.util.Scanner;

public class evenorodd {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("even num");
        }
        else {
            System.out.println("odd num");
        }


    }
}
