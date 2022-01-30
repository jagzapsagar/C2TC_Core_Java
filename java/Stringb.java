//package java sample programs.StringBuilder;
import java.util.*;
public class Stringb {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'b');

        System.out.println(sb);

        sb.insert(0, 'd');//insert d in 0 position
        System.out.println(sb);

        sb.delete(0,1);// delete 0 to 1 index
        System.out.println(sb);

        sb.append("kukkar");
        System.out.println(sb);

        System.out.print(sb.length());
    }
    
}
