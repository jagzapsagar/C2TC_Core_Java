public class polyt {
    public void m(Object o){
        System.out.println("Object class");
    }

    public void m(String s){
        System.out.println("String Class");
    }
    public void m(StringBuffer s){
        System.out.println("StringBuffered Class");
    }
    public static void main(String[] args) {

        polyt obj=new polyt();
       // obj.m(new Object());
        obj.m("avntika");
        obj.m(null);
        
    }
    
}
