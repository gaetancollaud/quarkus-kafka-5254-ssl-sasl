package org.acme.quarkus.sample;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Outgoing;

@ApplicationScoped
public class Test {
    
    private Executor executor = Executors.newSingleThreadExecutor();
//    private AtomicInteger counter = new AtomicInteger();
    
//    @Outgoing("match-result")
//    public CompletionStage<Message<Integer>> produceAsyncMessages() {
//        return CompletableFuture.supplyAsync(() -> Message.of(counter.incrementAndGet()), executor);
//      }
    
    @Outgoing("match-result")
    public CompletionStage<String> send() {
        return CompletableFuture.supplyAsync(() -> "test", executor);
    }
    

}
