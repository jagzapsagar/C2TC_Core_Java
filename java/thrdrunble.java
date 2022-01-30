public class thrdrunble implements Runnable {

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Sagar");
        }
    }

    public static void main(String[] args) {
        thrdrunble t=new thrdrunble();
        Thread tr=new Thread(t);
        tr.start();
        for(int i=0;i<5;i++){
            System.out.println("Jagzap");
        }
    }
    
}
