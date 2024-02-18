package strings;

public class strpalindrome {
    public static void main(String[] args){
        String s = "siva";
        String rev = "";
        for(int i =s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println("reverse of a string is: " + rev);
        if(s.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
