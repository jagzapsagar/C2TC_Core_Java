public class StaticVariable {
    int id;
    String name;
    static String comp="TCS";

    StaticVariable(int id,String name){
        this.id=id;
        this.name=name;
    }

    void Display(){
        System.out.println(id+name+comp);
    }
    public static void main(String[] args) {
        StaticVariable a=new StaticVariable(2,"Sgara");
        a.Display();
    }
    
}
