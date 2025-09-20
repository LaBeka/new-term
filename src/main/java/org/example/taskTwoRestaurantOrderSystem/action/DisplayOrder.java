package org.example.taskTwoRestaurantOrderSystem.action;


import java.util.Collection;
import java.util.List;
import org.example.taskTwoRestaurantOrderSystem.Receipt;
import org.example.taskTwoRestaurantOrderSystem.dishes.Pizza;

public class DisplayOrder implements Actionable {

  @Override
  public ActionEnum getType() {
    return null;
  }

  @Override
  public void doSomethingOperand(Object... operands) {
    Receipt receipt = (Receipt) operands[0];
    System.out.println("******************Display order******************");
    List<Pizza> orders = receipt.getOrders();
    if(!receipt.getOrders().isEmpty()){
      System.out.println("Your current order : ");

      for (int i = 0; i < receipt.getOrders().size(); i++){
        if(receipt.getOrders().size() == 1 || i == receipt.getOrders().size() - 1){
          System.out.print(orders.get(i).getName() + " ");
        } else {
          System.out.print(orders.get(i).getName() + ", ");
        }
      }

    } else {
      System.out.println("You do not have any orders");
    }
  }

  @Override
  public void doSomething(Receipt receipt, Collection<Pizza> pizzas) {
    System.out.println("******************Display order******************");
    if(receipt.getOrders().size() > 0){
      System.out.println("Your current order : ");
      for (Pizza p: receipt.getOrders()){
        if(receipt.getOrders().size() == 1){
          System.out.print(p.getName() + " ");
        } else {
          System.out.print(p.getName() + ", ");
        }
      }
    } else {
      System.out.println("You do not have any orders");
    }
  }
}
