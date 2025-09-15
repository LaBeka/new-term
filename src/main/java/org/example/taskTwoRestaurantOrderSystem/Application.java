package org.example.taskTwoRestaurantOrderSystem;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void initRestaurant(){
    runPizzeria();
  }

  private static void runPizzeria() {
      Pizza pizza = new Pizza(PizzaType.MARGARITA.name(), 180, new Recipe(6, List.of(
          new Ingredient("Dough", "1 kg", "baked"),
          new Ingredient("Cheese", 1, "mozzarella"),
          new Ingredient("Tomato", 2, "sliced"))
      ));
  }


//  public PizzaType getType(String name) {
//    return PizzaType.valueOf(name.toUpperCase());
//  }


//  public Pizza cook() {
//    switch (getType(this.name)){
//      case MARGARITA:
//        Recipe margarita = new Recipe(6, {
//            new Ingredient("Dough", "1 kg", "baked"),
//            new Ingredient()
//        } );
//        break;
//      case FUNGI:
//        break;
//      case VESUVIO:
//        break;
//      case NAPOLI:
//        break;
//      case PROCSHUTTO_CRUDO:
//        break;
//      default:
//        System.out.println("Can not find the pizza with name " + this.name);
//        break;
//    }
//    return this;
//  }
}
