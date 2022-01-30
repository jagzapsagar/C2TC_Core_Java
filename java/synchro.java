import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
public class synchro {
    public static void main(String[] args) {

        ReentrantLock l=new ReentrantLock();
        
        l.lock();
        System.out.println(l.isLocked());

        l.unlock();
        
    }
    
}
