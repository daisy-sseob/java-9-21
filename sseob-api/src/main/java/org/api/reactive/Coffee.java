package org.api.reactive;

public class Coffee {
  
  private String name;
  
  private String size;

  public Coffee(String name, String size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSize(String size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "Coffee{" +
            "name='" + name + '\'' +
            ", size='" + size + '\'' +
            '}';
  }
}
