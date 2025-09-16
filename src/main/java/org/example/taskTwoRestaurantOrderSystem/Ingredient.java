package org.example.taskTwoRestaurantOrderSystem;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Ingredient {

  private String name;
  private String quantityGr;
  private int quantity;
  private String description;

  public Ingredient(String name, int quantity, String description) {
    this.name = name;
    this.quantity = quantity;
    this.description = description;
  }

  public Ingredient(String name, String quantityGr, String description) {
    this.name = name;
    this.quantityGr = quantityGr;
    this.description = description;
  }

}
