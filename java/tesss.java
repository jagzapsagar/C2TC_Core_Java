public class tesss {
    static int a;


static
{
    a=4;
    System.out.print("inside static block");
    System.out.print("a="+a);
}
Test()
{
    System.out.print("inside citrctor");
    a=10;
}



    public static void main(String[] args) {

