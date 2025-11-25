package Java.Advance.Concurrency;

public class RunnableDemo {
    public static void main(String[] args) {
        // Thread thread = new Thread(new MyRunnable());
        // thread.start();

        Thread thread = new Thread(() -> {
            System.out.println("Lambda Runnable: " + Thread.currentThread().getName());
        });
        thread.start();
    }

    public static class MyRunnable implements Runnable {
        public void run(){
            System.out.println("Running Runnable Thread");
        }
    }
}
