package org.example.taskTwoRestaurantOrderSystem;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Recipe {

  private List<Ingredient> ingredients;
  private int slices;

  public Recipe(int slices, List<Ingredient> ingredients) {
    this.slices = slices;
    this.ingredients = ingredients;
  }
}
