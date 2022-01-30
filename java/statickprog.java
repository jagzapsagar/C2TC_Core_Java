

public class statickprog {

    static int a=10;
    static int b=30;
     int c=40;

    void m(){
         int h=20; 
         //static int b=99 //we can not use here static keyword bcoz its local
         System.out.println(h);
    }

    
    public static void main(String[] args) {
        System.out.println(a);
        statickprog s1=new statickprog();
        s1.m();
        System.out.println("Endddd");
        System.out.println(statickprog.b);
       // System.out.println(statickprog.c);   this type of acces can not work
        
    }
    
}
