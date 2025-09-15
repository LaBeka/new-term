package org.example.taskTwoRestaurantOrderSystem;


public class Pizza {
  private String name;
  private int price;
  private Recipe recipe;

  public Pizza(String name, int price, Recipe recipe) {
    this.name = name;
    this.price = price;
    this.recipe = recipe;
  }
  public String getName() {return name;}


}
