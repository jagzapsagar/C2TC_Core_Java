import java.util.Scanner;

public class Radius {

    public static double CalRad(Double rad){
        double radius=3.14*rad*rad;
        return radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double rad=CalRad(r);
        System.out.println(rad);
    }
    
}
