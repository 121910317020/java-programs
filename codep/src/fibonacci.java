public class fibonacci {
    public static void main(String [] args){
        int a=0,b=1;
        int num = 15;
        System.out.println(a);
        System.out.println(b);
        for(int i=2; i<num;i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
