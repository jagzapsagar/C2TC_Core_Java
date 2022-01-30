import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("AAA");
        System.out.println(a);

        a.add("B");
        a.add(10);
        a.add(null);
        System.out.println(a);

        a.add(2,15);
        System.out.println(a);

        
    }
    
}
