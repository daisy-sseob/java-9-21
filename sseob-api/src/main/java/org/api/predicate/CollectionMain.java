package org.api.predicate;

import java.util.List;
import java.util.function.Predicate;

public class CollectionMain {

  public static void main(String[] args) {

    List<String> strings = List.of("A", "B", "C", "");

    List<String> blankString = strings.stream()
            .filter(String::isBlank)
            .toList();

    System.out.println(blankString);
    
    List<String> notBlankString = strings.stream()
            .filter(Predicate.not(String::isBlank))
            .toList();
    
    System.out.println(notBlankString);

  }
  
}
