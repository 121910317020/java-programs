package strings;

import java.util.Scanner;

public class vowelorconsonant {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a char");
        String a = sc.next();
        if(a.equalsIgnoreCase("a") || a.equalsIgnoreCase("e") || a.equalsIgnoreCase("i") || a.equalsIgnoreCase("o") || a.equalsIgnoreCase("u")){
            System.out.println("given char is  a vowel");
        }
        else {
            System.out.println("given char is a consonant");
        }
    }
}
