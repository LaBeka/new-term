package org.example.taskTwoRestaurantOrderSystem.action;

import java.util.Collection;
import org.example.taskTwoRestaurantOrderSystem.Receipt;
import org.example.taskTwoRestaurantOrderSystem.dishes.Pizza;

public class PrintReceipt implements Actionable {

  @Override
  public ActionEnum getType() {
    return ActionEnum.PRINT_RECEIPT;
  }

  @Override
  public void doSomethingOperand(Object... operands) {
    Receipt receipt = (Receipt) operands[0];

    System.out.println("**************************Print receipt***************************");

    if(receipt.isReceiptIsPayed()){
      receipt.setReceiptIsPrinted(true);
      System.out.println("Receipt is printed successfully");
    } else if (receipt.getOrders().size() <= 0) {
      System.out.println("There is nothing to print, please order first.");
    } else {
      System.out.println("Before to print the receipt it needs to be payed, please try to pay.");
    }
  }

  @Override
  public void doSomething(Receipt receipt, Collection<Pizza> pizzas) {
    System.out.println("**************************Print receipt***************************");

    if(receipt.isReceiptIsPayed()){
      receipt.setReceiptIsPrinted(true);
      System.out.println("Receipt is printed successfully");
    } else if (receipt.getOrders().size() <= 0) {
      System.out.println("There is nothing to print, please order first.");
    } else {
      System.out.println("Before to print the receipt it needs to be payed, please try to pay.");
    }
  }
}
