public class palindrome {
    public static void main(String args[]) {
        int a = 120;
        int temp =a;
        int rev = 0;
        while (a != 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;

        }
        if(temp == rev){
            System.out.println("given number is a palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
