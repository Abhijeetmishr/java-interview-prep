package Java.Advance.Concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        
    }

    public static void accessSharedResource(){
        lock.lock();


        lock.unlock();
    }
}
