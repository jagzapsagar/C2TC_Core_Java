class demo{
    int empid;
    String empName;
    String compName;
     //compName="TCS";

    demo(int empid,String empName, String compNam){
   // demo(int empid,String empName){
        this.empid=empid;
        this.empName=empName;
        this.compName=compName;
        
    }
    void Display(){
        System.out.println(empid + empName + compName);
    }
}
public class Ststickey {
    public static void main(String[] args) {
        demo d=new demo(2,"sagar","TCS");
        d.Display();
        demo d2=new demo(3,"nagare","persistant");
        d2.Display();

        
    }
    
}
