import java.util.Scanner;

public class addition {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the vaue of a");
        int a = obj.nextInt();
        if(a>0){
            System.out.println(a +" is a positive number");
        }else{
            System.out.println(a + " is a negative number");
        }
    }
}
