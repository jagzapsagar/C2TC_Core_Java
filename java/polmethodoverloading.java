public class polmethodoverloading {
    void m()
    {
        System.out.print("No Parameter");
    }

    void m(int i)
    {
        System.out.print("Int Parameter");
    }
    void m(double d)
    {
        System.out.print("Double Parameter");
    }

    void m(char a)
    {
        System.out.print("Char Parameter");
    }
    public static void main(String[] args) {
        polmethodoverloading p=new polmethodoverloading();
        p.m(20.21); 

        p.m('a');
        p.m();
        
    }
    
}
