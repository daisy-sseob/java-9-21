package org.api.reactive;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow;
import java.util.concurrent.Future;

public class CoffeePublisher implements Flow.Publisher<Coffee> {

  @Override
  public void subscribe(Flow.Subscriber<? super Coffee> subscriber) {

    subscriber.onSubscribe(new CoffeeSubscription(subscriber));
    
  }

  public static class CoffeeSubscription implements Flow.Subscription {

    private final Flow.Subscriber<? super Coffee> subscriber;
    private Future<?> future;

    public CoffeeSubscription(Flow.Subscriber<? super Coffee> subscriber) {
      this.subscriber = subscriber;
    }

    @Override
    public void request(long n) {

      if (n < 0) {
        subscriber.onError(new IllegalArgumentException());
      } else {

        CompletableFuture.runAsync(() -> {
          // 커피 제작에 1초가 소요됩니다.
          try {
            Thread.sleep(2_000);
            subscriber.onNext(new Coffee("Latte", "Medium"));
          } catch (InterruptedException e) {
            throw new RuntimeException("커피 제작 실패");
          }
        });
        
      } 
      
    }

    @Override
    public void cancel() {
      if (future != null) {
        future.cancel(false); // 비동기 작업 취소 false
      }
    }
    
  }
  
}
