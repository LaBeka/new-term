package org.example.taskTwoRestaurantOrderSystem.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.example.taskTwoRestaurantOrderSystem.Person;
import org.example.taskTwoRestaurantOrderSystem.Receipt;
import org.example.taskTwoRestaurantOrderSystem.dishes.Pizza;
import org.w3c.dom.ls.LSOutput;

public class OrderPizza implements Actionable {

  @Override
  public ActionEnum getType() {
    return ActionEnum.ORDER;
  }

  @Override
  public void doSomethingOperand(Object... operands) {
    System.out.println("*********************************Order pizza*********************************");
    Receipt receipt = (Receipt) operands[0];
    Collection<Pizza> pizzas = (Collection<Pizza>) operands[1];

    Scanner scanner = new Scanner(System.in);

    Map<String, Pizza> byMenuName = new HashMap<>();
    for (Pizza p : pizzas) {
      if(p.getTotal() >= 1){
        System.out.print(p.getName() + " x " + p.getTotal() + " ");
        byMenuName.put(p.getName().toLowerCase(), p);
      }
    }
    System.out.println(" are available currently.");
    System.out.print("Enter pizza name ");
    String choice = scanner.nextLine();

    String[] names = choice.split("\\s+"); // Splits by one or more whitespace characters
    List<String> invalidStr = new ArrayList<String>();

    for (int i = 0; i < names.length; i++) {

      String inputName = names[i].trim().toLowerCase();
      Pizza pizzaName = byMenuName.get(inputName);

      if(pizzaName == null){
        invalidStr.add(inputName);
        continue;
      }
      if(pizzaName.getTotal() > 0){
        receipt.addOrders(pizzaName);
        pizzaName.setTotal(pizzaName.getTotal() - 1);

        if(pizzaName.getTotal() == 0){
          byMenuName.entrySet().removeIf(entry -> entry.getValue().getTotal() == 0);
        }

      }
    }
    System.out.println("\nYou entered invalid name or it is out of stock : " + invalidStr.toString());


    receipt.printOrders();
  }

  @Override
  public void doSomething(Receipt receipt, Collection<Pizza> pizzas) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("*********************************Order pizza*********************************");
    System.out.println("Enter pizza name ");
    for (Pizza pizza : pizzas) {
      if(pizza.getTotal() >= 1){
        System.out.print(pizza.getName() + " ");
      }
    }

    System.out.println();
    String choice = scanner.nextLine();

    String[] names = choice.split("\\s+"); // Splits by one or more whitespace characters

    for (int i = 0; i < names.length; i++) {
      for (Pizza pizza : pizzas) {
        String pizzaName = pizza.getName().trim().toLowerCase();
        String orderName = names[i].trim().toLowerCase();
        boolean isMatch = orderName.equals(pizzaName);
        if(isMatch){
          receipt.addOrders(pizza);
        }
      }
    }

    //needs to print first current order & then total order
    System.out.print("You ordered: ");
    receipt.printOrders();
  }
}
