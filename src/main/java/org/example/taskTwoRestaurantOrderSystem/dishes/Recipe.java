package org.example.taskTwoRestaurantOrderSystem.dishes;

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

  @Override
  public String toString() {
    StringBuffer describeIngredients = new StringBuffer();
    for (Ingredient ing : ingredients) {
      describeIngredients.append(ing.toString());
    }
    describeIngredients.append(getSlices() + " slices");
    return describeIngredients.toString();
  }
}
