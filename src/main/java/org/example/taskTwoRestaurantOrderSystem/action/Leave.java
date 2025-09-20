package org.example.taskTwoRestaurantOrderSystem.action;

import java.util.Collection;
import org.example.taskTwoRestaurantOrderSystem.Receipt;
import org.example.taskTwoRestaurantOrderSystem.dishes.Pizza;

public class Leave implements Actionable {

  @Override
  public ActionEnum getType() {
    return ActionEnum.LEAVE;
  }

  @Override
  public void doSomethingOperand(Object... operands) {
    Receipt receipt = (Receipt) operands[0];
    if(!receipt.getOrders().isEmpty()) {
      if (!receipt.isReceiptIsPayed()) {
        System.out.printf("%n" + receipt.getPerson().getName() + ", you have not paid order.%n");
        System.out.printf("%nYou have " + receipt.getTotal() + "SEK to pay. Do not leave Pizzeria without paying.%n%n");
        return;
      }
    }
    receipt.getPerson().setInPizzeria(false);
    System.out.printf("%n" + receipt.getPerson().getName() + " is leaving Pizzeria.%n%n");
  }

  @Override
  public void doSomething(Receipt receipt, Collection<Pizza> pizzas) {
    if(receipt.getOrders().size() > 0) {
      if (!receipt.isReceiptIsPayed()) {
        System.out.printf("%n" + receipt.getPerson().getName() + ", you have not paid order.%n");
        System.out.printf("%nYou have " + receipt.getTotal() + "SEK to pay. Do not leave Pizzeria without paying.%n%n");
        return;
      }
    }
    receipt.getPerson().setInPizzeria(false);
    System.out.printf("%n" + receipt.getPerson().getName() + " is leaving Pizzeria.%n%n");
  }
}
