package org.example.taskTwoRestaurantOrderSystem.action;

import java.util.Collection;
import org.example.taskTwoRestaurantOrderSystem.Receipt;
import org.example.taskTwoRestaurantOrderSystem.dishes.Pizza;

public class Pay implements Actionable {

  @Override
  public ActionEnum getType() {
    return ActionEnum.PAY;
  }

  @Override
  public void doSomethingOperand(Object... operands) {
    Receipt receipt = (Receipt) operands[0];

    System.out.println("********************************* PAY *********************************");

    if(receipt.getOrders().isEmpty()){
      System.out.println("You have nothing to pay! Try to order first.");
    } else {
      System.out.println("Total price to pay is " + receipt.getTotal());
      receipt.setReceiptIsPayed(true);
    }
  }

  @Override
  public void doSomething(Receipt receipt, Collection<Pizza> pizzas) {
    System.out.println("********************************* PAY *********************************");

    if(receipt.getOrders().isEmpty()){
      System.out.println("You have nothing to pay! Try to order first.");
    } else {
      System.out.println("Total price to pay is " + receipt.getTotal());
      receipt.setReceiptIsPayed(true);
    }
  }
}
