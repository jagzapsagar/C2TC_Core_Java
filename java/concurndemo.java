import java.util.concurrent.locks.ReentrantLock;

public class concurndemo {

    public static void main(String[] args) {
        ReentrantLock l=new ReentrantLock();

        l.lock();
        l.lock();
        l.lock();

        System.out.println(l.getQueueLength());
       
        
    }
    
}
