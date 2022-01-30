//package java sample programs.abstract;

public class static_block {
    static int a;
    public static void main(String[] args) {
        System.out.println("Executing main block");
        System.out.println(a);
        
    }
    static void m()
    //static keyword use
    {
        System.out.println("i am static method");
    }
    static
    {
        System.out.println("india is the best");
        static_block.m();
    }
    static
    {
        System.out.println("vande mataram");
    }
    static
    {
        System.out.println("jay hind");
    }
    
}
