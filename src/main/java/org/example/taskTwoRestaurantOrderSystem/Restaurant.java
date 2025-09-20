package org.example.taskTwoRestaurantOrderSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.example.InputHandler;
import org.example.taskTwoRestaurantOrderSystem.action.DisplayOrder;
import org.example.taskTwoRestaurantOrderSystem.action.PrintReceipt;
import org.example.taskTwoRestaurantOrderSystem.action.Leave;
import org.example.taskTwoRestaurantOrderSystem.action.OrderPizza;
import org.example.taskTwoRestaurantOrderSystem.action.Pay;
import org.example.taskTwoRestaurantOrderSystem.action.ShowMenu;
import org.example.taskTwoRestaurantOrderSystem.dishes.Ingredient;
import org.example.taskTwoRestaurantOrderSystem.dishes.Pizza;
import org.example.taskTwoRestaurantOrderSystem.dishes.PizzaType;
import org.example.taskTwoRestaurantOrderSystem.dishes.Recipe;

public class Restaurant {

  private List<Receipt> history;
  private Collection<Pizza> availablePizzas;

  public Restaurant() {
    this.history = new ArrayList<>();
    this.availablePizzas = generatePizza();
  }

  public void initRestaurant(){

    List<Person> clients = List.of(
        new Person("Kalle"),
        new Person("Alle"),
        new Person("Olle"),
        new Person("Molly"),
        new Person("Amy")
    );


    for (int i = 0; i < clients.size(); i++) {
      //once person is in pizzeria, do not run pizzeria to other people

      for (int p = i+1; p < clients.size(); p++){
        System.out.print(clients.get(p).getName() + " ");
      }
      if(i < (clients.size()-1)) System.out.println("are on wait list.\n");

      System.out.printf("Welcome to Pizzeria " + clients.get(i).getName() + "!");
      clients.get(i).setInPizzeria(true);

      runPizzeria(new Receipt(clients.get(i)));
    }

    printHistory();
  }


  private void runPizzeria(Receipt receipt) {


    while(receipt.getPerson().isInPizzeria()) {
      System.out.printf("%nEnter what would you like to do:%n" +
          "1 Ask for menu. 2 Order a pizza. 3 Display my orders. 4 Pay. 5 Ask receipt. 6 Leave Pizzeria%n");

        int choice = InputHandler.scanCheckIfInteger(0, 7);
      switch (choice) {
        case 1:
          receipt.doAction(new ShowMenu(), availablePizzas);
          break;
        case 2:
          receipt.doAction(new OrderPizza(), availablePizzas);
          break;
        case 3:
          receipt.doAction(new DisplayOrder(), availablePizzas);
          break;
        case 4:
          receipt.doAction(new Pay(), availablePizzas);
          break;
        case 5:
          receipt.doAction(new PrintReceipt(), availablePizzas);
          break;
        case 6:
          receipt.doAction(new Leave(), availablePizzas);
          break;
        default:
          System.out.println("Invalid choice.");
          break;
      }
    }

    history.add(receipt);

  }


  private void printHistory() {
    for (Receipt receipt : history) {
      System.out.println(receipt.getPerson().getName() + "'s total order is: " + receipt.getTotal());
    }
  }
  private Collection<Pizza> generatePizza() {
      Pizza margarita = new Pizza(PizzaType.MARGARITA.name(), 150, new Recipe(6, List.of(
          new Ingredient("Dough", 500, "baked"),
          new Ingredient("Cheese", 200, "mozzarella"),
          new Ingredient("Tomato", 2, "sliced"),
          new Ingredient("Oregano", "a pinch of oregano", "dried"))
      ), 2);

      Pizza fungi = new Pizza(PizzaType.FUNGI.name(), 100, new Recipe(6, List.of(
          new Ingredient("Dough", 500, "baked"),
          new Ingredient("Cheese", 300, "mozzarella"),
          new Ingredient("Mashrooms", 100, "sliced"),
          new Ingredient("Basil", "bunch of leaves", "fresh"))
      ), 2);
      Pizza vesuvio = new Pizza(PizzaType.VESUVIO.name(), 130, new Recipe(6, List.of(
          new Ingredient("Neapolitan dough", 500, "baked"),
          new Ingredient("Ricotta", 300, "creamy"),
          new Ingredient("Salami", 100, "savory"),
          new Ingredient("Artichokes", 20, "tender"),
          new Ingredient("Mushrooms", 100, "earthy"))
      ), 2);
      Pizza napoli = new Pizza(PizzaType.NAPOLI.name(), 140, new Recipe(6, List.of(
          new Ingredient("wheat dough", 500, "baked"),
          new Ingredient("mozzarella cheese", 300, "fresh"),
          new Ingredient("extra virgin olive oil", 5, "italian"),
          new Ingredient("Basil", "bunch of leaves", "fresh"))
      ), 2);
      Pizza procshuttoCrudo = new Pizza(PizzaType.PROCSHUTTO_CRUDO.name(), 1250, new Recipe(6, List.of(
          new Ingredient("Dough", 500, "baked"),
          new Ingredient("mozzarella cheese", 300, "fresh"),
          new Ingredient("Tomato sauce", 100, "fresh"),
          new Ingredient("Prosciutto D'Abruzzo", 80, "fresh"),
          new Ingredient("Parmesan cheese", 100, "fresh"))
      ), 2);

      List<Pizza> availablePizza = new ArrayList<>();
      availablePizza.add(margarita);
      availablePizza.add(fungi);
      availablePizza.add(vesuvio);
      availablePizza.add(napoli);
      availablePizza.add(procshuttoCrudo);


      return Collections.unmodifiableCollection(availablePizza);
  }

}
