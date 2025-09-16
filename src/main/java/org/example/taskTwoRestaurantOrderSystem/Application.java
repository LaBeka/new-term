package org.example.taskTwoRestaurantOrderSystem;

import java.util.List;

public class Application {

  public static void initRestaurant(){
    runPizzeria();
  }

  private static void runPizzeria() {
      Pizza margarita = new Pizza(PizzaType.MARGARITA.name(), 180, new Recipe(6, List.of(
          new Ingredient("Dough", 500, "baked"),
          new Ingredient("Cheese", 200, "mozzarella"),
          new Ingredient("Tomato", 2, "sliced"),
          new Ingredient("Oregano", "a pinch of oregano", "dried"))
      ));

      Pizza fungi = new Pizza(PizzaType.FUNGI.name(), 180, new Recipe(6, List.of(
          new Ingredient("Dough", 500, "baked"),
          new Ingredient("Cheese", 300, "mozzarella"),
          new Ingredient("Mashrooms", 100, "sliced"),
          new Ingredient("Basil", "bunch of leaves", "fresh"))

      ));
      Pizza vesuvio = new Pizza(PizzaType.FUNGI.name(), 180, new Recipe(6, List.of(
          new Ingredient("Neapolitan dough", 500, "baked"),
          new Ingredient("Ricotta", 300, "creamy"),
          new Ingredient("Salami", 100, "savory"),
          new Ingredient("Artichokes", 20, "tender"),
          new Ingredient("Mushrooms", 100, "earthy"))

      ));
      Pizza napoli = new Pizza(PizzaType.FUNGI.name(), 180, new Recipe(6, List.of(
          new Ingredient("wheat dough", 500, "baked"),
          new Ingredient("mozzarella cheese", 300, "fresh"),
          new Ingredient("extra virgin olive oil", 5, "italian"),
          new Ingredient("Basil", "bunch of leaves", "fresh"))

      ));
      Pizza procshuttoCrudo = new Pizza(PizzaType.FUNGI.name(), 180, new Recipe(6, List.of(
          new Ingredient("Dough", 500, "baked"),
          new Ingredient("mozzarella cheese", 300, "fresh"),
          new Ingredient("Tomato sauce", 100, "fresh"),
          new Ingredient("Prosciutto D'Abruzzo", 80, "fresh"),
          new Ingredient("Parmesan cheese", 100, "fresh"))
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
