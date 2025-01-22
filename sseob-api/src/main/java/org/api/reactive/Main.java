package org.api.reactive;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    CoffeePublisher publisher = new CoffeePublisher();
    CoffeeSubscriber subscriber = new CoffeeSubscriber();
    
    publisher.subscribe(subscriber);
    
    Thread.sleep(5_000);

  }
}
