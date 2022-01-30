//package java sample programs.StringBuilder;
import java.util.*;
public class ReversString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");

        for(int i=0;i<sb.length()/2;i++){

            int front=i;
            int back=sb.length()-1-i;

            char frontc=sb.charAt(front);
            char backc=sb.charAt(back);

            sb.setCharAt(front, backc);
            sb.setCharAt(back, frontc);
        }
        System.out.println(sb);
    }
    
}
