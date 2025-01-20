package org.domain.service;

public class MemoryStringRepository implements StringRepository {

  @Override
  public void save(String string) {
    System.out.println("MemorySaveRepository save: " + string);
  }
  
}
