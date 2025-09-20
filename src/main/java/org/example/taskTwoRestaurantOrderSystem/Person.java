package org.example.taskTwoRestaurantOrderSystem;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {

  private String name;
  private boolean inPizzeria;

  public Person(String name) {
    this.name = name;
  }

}
