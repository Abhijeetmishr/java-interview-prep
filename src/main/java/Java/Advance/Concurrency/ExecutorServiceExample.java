package Java.Advance.Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("ExecutorService Example");
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            final int number = i;
            tasks.add(() -> {
                System.out.println("Calculating square of " + number + " in " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(2); // Simulate long computation
                return "Square of " + number + " is " + (number * number);
            });
        }

        //Executing a single callable task
        Future<String> result = executorService.submit(() -> "Hello from callable");
        System.out.println(result.get());
        
        //Executing multiple callable tasks
        List<Future<String>> futures = executorService.invokeAll(tasks);
        
        for(Future<String> future : futures) {
            System.out.println(future.get());
        }

        //Use invokeAny: returns the result of the fastest successful task
        String fastestResult = executorService.invokeAny(tasks);
        System.out.println("Fastest result: " + fastestResult);
    }
}
