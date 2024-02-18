public class armstrongnum {
    public static void main(String[] args){
        int a = 153;
        int temp = a;
        int arm =0;
        while (a > 0){
            int rem=a%10;
            arm = arm+(rem*rem*rem);
            a = a/10;
        }
        if(arm == temp){
            System.out.println("armstrong");
        }else {
            System.out.println("not armstrong");
        }
    }
}
