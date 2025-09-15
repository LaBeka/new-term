package org.example.taskTwoRestaurantOrderSystem;

import java.util.List;

public class Recipe {

  private List<Ingredient> ingredients;
  private int slices;

  public Recipe(int slices, List<Ingredient> ingredients) {
    this.slices = slices;
    this.ingredients = ingredients;
  }
}
