package Java.Advance.Concurrency;

public class ThreadClassDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }

    public static class MyThread extends Thread {
        public void run(){
            System.out.println("Running Thread Class Demo");
        }
    }
}

