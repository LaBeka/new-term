package org.example.taskTwoRestaurantOrderSystem.dishes;

import java.util.Optional;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Ingredient {

  private String name;
  private String quantity;
  private int quantityGr;
  private String description;

  public Ingredient(String name, int quantityGr, String description) {
    this.name = name;
    this.quantityGr = quantityGr;
    this.description = description;
  }

  public Ingredient(String name, String quantity, String description) {
    this.name = name;
    this.quantity = quantity;
    this.description = description;
  }

  @Override
  public String toString() {
    String quantityValue = "";
    if (Optional.ofNullable(getQuantity()).isEmpty()){
      quantityValue = String.valueOf(getQuantityGr()) + " gr ";
    } else { quantityValue = quantity + " "; };

    return quantityValue + "of " + description.toLowerCase() + " " + name.toLowerCase() + ", ";
  }
}
