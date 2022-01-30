public class demo extends Thread {

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Sagar");
        }
    }

    public static void main(String[] args) {
        demo a=new demo();
        a.start();

        for(int i=0;i<5;i++){
            System.out.println("Jagzap");
        }

    }

    
}
