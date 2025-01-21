package org.api.reactive;

import java.util.concurrent.Flow;

public class CoffeeSubscriber implements Flow.Subscriber<Coffee> {

  private Flow.Subscription subscription;
  
  @Override
  public void onSubscribe(Flow.Subscription subscription) {
    this.subscription = subscription;
    subscription.request(1);
  }

  @Override
  public void onNext(Coffee item) {
    System.out.println(item.toString());
  }

  @Override
  public void onError(Throwable throwable) {

    System.out.println("에러 발생");
  }

  @Override
  public void onComplete() {

    System.out.println("더 이상 받을 커피가 없습니다.");
    subscription.cancel();
  }
  
}
