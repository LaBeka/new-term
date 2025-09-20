package org.example.taskTwoRestaurantOrderSystem.action;

import java.util.Collection;
import org.example.taskTwoRestaurantOrderSystem.Receipt;
import org.example.taskTwoRestaurantOrderSystem.dishes.Pizza;

public interface Actionable {

  ActionEnum getType();

  void doSomething(Receipt receipt, Collection<Pizza> pizzas);
  void doSomethingOperand(Object ... operands);

}
