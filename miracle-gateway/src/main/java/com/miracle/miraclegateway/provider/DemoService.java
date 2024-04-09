package com.miracle.miraclegateway.provider;

import java.util.concurrent.CompletableFuture;

/**
 * @author dargon
 * @create 2024-04-09
 */
public interface DemoService {

    String sayHello(String name);

    String sayHello2(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }

}

