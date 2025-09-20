package org.example.taskTwoRestaurantOrderSystem.dishes;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Pizza {
  @Getter
  private String name;
  private int price;
  private Recipe recipe;
  private int total;

  public Pizza(String name, int price, Recipe recipe, int total) {
    this.name = name;
    this.price = price;
    this.recipe = recipe;
    this.total = total;
  }

  @Override
  public String toString() {
    return "Pizza " + name + ", ingredients: " + 
        recipe.toString() +", price=" + price;
  }
}
