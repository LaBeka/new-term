package org.example.taskTwoRestaurantOrderSystem.action;

import java.util.Collection;
import org.example.taskTwoRestaurantOrderSystem.Person;
import org.example.taskTwoRestaurantOrderSystem.Receipt;
import org.example.taskTwoRestaurantOrderSystem.dishes.Pizza;

public class ShowMenu implements Actionable {

  @Override
  public ActionEnum getType() {
    return ActionEnum.SHOW_MENU;
  }

  @Override
  public void doSomethingOperand(Object... operands) {
    Collection<Pizza> pizzas = (Collection<Pizza>) operands[1];

    System.out.println("***************************MENU****************************");
    for (Pizza pizza : pizzas) {
      if(pizza.getTotal() > 0){
        System.out.println(pizza.toString());
      }
    }
  }

  @Override
  public void doSomething(Receipt receipt, Collection<Pizza> pizzas) {
    System.out.println("***************************MENU****************************");
    for (Pizza pizza : pizzas) {
      if(pizza.getTotal() > 0){
        System.out.println(pizza.toString());
      }
    }
  }
}
