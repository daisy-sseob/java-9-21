package org.api;

import org.api.service.StringSaveComponent;
import org.domain.Domain;
import org.domain.Person1;

import java.lang.reflect.Field;

public class Main {
  public static void main(String[] args) throws Exception {
   
    System.out.println("Hello api");

    Domain.hello();

    // 기본적으로 모듈로 추가된 class 는 deep reflection이 불가능하다.
    // 여기서 말하는 모듈은 java 9 module임.
    Person1 person1 = new Person1();
    Class<Person1> person1Class = Person1.class;
    Field name = person1Class.getDeclaredField("name");
    name.setAccessible(true);
    name.set("name", "John");
  }
}