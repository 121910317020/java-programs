package strings;

public class removevowels {
    public  static  void main(String[] args){
        String s = "adssfAsasvdf";
        String s1 = "";
        s1 = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String after removing vowel : "+s1);
    }
}
