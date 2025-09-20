package org.example.taskTwoRestaurantOrderSystem.dishes;

public enum PizzaType {
  MARGARITA("Margarita"),
  FUNGI("Fungi"),
  VESUVIO("Vesuvio"),
  NAPOLI("Napoletana"),
  PROCSHUTTO_CRUDO("Procshutto crudo");

  private final String name;

  PizzaType(String name) {
    this.name = name;
  }
}
