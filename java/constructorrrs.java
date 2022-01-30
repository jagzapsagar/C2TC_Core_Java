public class constructorrrs {

    String name;
    int no;

    public constructorrrs(String name, int no){   //Constructor:it is used to initilize the values
        this.name=name;
        this.no=no;
        //System.out.println(name + no);     // we can print here 
        //System.out.println("**************");  // we can print here 
    }

    void disp(){
        System.out.println("#########");
        System.out.println(name + no);
        System.out.println("##########");

    }
    public static void main(String[] args) {
        constructorrrs c=new constructorrrs("Sagar", 5); // Passing the value to constructor
        c.disp();
       // System.out.println(c.name + c.no);  //  we can print here 
        constructorrrs c2=new constructorrrs("Sanket", 6); // Passing the value to constructor
        c2.disp();
        //System.out.println(c2.name + c2.no);   // we can print here 
        
    }
    
}
