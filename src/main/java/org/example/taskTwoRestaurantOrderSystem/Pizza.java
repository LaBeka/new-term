package org.example.taskTwoRestaurantOrderSystem;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Pizza {
  @Getter
  private String name;
  private int price;
  private Recipe recipe;

  public Pizza(String name, int price, Recipe recipe) {
    this.name = name;
    this.price = price;
    this.recipe = recipe;
  }


}
