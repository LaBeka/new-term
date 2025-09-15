package org.example.taskTwoRestaurantOrderSystem;

public class Ingredient {

  private String name;
  private String quantityKg;
  private int quantity;
  private String description;

  public Ingredient(String name, int quantity, String description) {
    this.name = name;
    this.quantity = quantity;
    this.description = description;
  }

  public Ingredient(String name, String quantityKg, String description) {
    this.name = name;
    this.quantityKg = quantityKg;
    this.description = description;
  }
}
