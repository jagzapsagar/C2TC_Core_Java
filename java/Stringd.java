//package java sample programs.StringBuffered;

public class Stringd {
    public static void main(String[] args) {
        char c[]={'J','A','V','A'};

        String s1=new String(c);
        String s2=new String(s1);

        System.out.println(s1);
        System.out.println(s2);

        String longStr="This have "+"wrrap around";
        System.out.println(longStr);
    }
    
}
