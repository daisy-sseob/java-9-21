package org.domain.service;

public class DatabaseStringRepository implements StringRepository {
  @Override
  public void save(String string) {
    System.out.println("DatabaseStringRepository save: " + string);
  }
}
