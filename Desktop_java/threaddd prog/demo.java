public class demo extends Thread {

    public void run(){          //Predifine method Run in Thread class
        for(int i=0;i<5;i++){
            System.out.println("Sagar");
        }
    }

    public static void main(String[] args) {
        demo a=new demo();       // Object for main class
        a.start();                 // Starting thread

        for(int i=0;i<5;i++){       
            System.out.println("Jagzap");
        }

    }

    
}
