package Java.Advance.Concurrency;

import java.util.concurrent.CompletableFuture;

public class CompleteableFutureDemo {
    //Why Completeable future and why it is better than callable future ?
    // ans -> https://youtu.be/ImtZgX1nmr8?si=ZBLLnm2Rll--svfe

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            CompletableFuture.supplyAsync(() -> getOrder())
                             .thenApply(order -> enrichOrder(order))
                             .thenApply(o -> performPayment(o))
                             .thenApply(newOrder -> dispatchOrder(newOrder))
                             .thenAccept(newOrder -> sendNotification(newOrder));
        }
    }
}
