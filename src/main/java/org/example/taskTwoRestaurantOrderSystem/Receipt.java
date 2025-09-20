package org.example.taskTwoRestaurantOrderSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.example.taskTwoRestaurantOrderSystem.action.Actionable;
import org.example.taskTwoRestaurantOrderSystem.dishes.Pizza;

@Getter @Setter
public class Receipt {

  private Person person;
  private String orderId;
  private boolean receiptIsPayed;
  private boolean receiptIsPrinted;
  private List<Pizza> orders;
  private int total;


  public Receipt(Person person) {
    this.person = person;
    this.orders = new ArrayList<>();
  }

  public void setOrders() {
    this.orders.clear();
  }

  public void addOrders(Pizza pizza) {
    this.orders.add(pizza);
  }

  public void printOrders(){
    int pr = 0;
    System.out.print("You ordered: ");
    for(Pizza pizza : orders){
      pr += pizza.getPrice();
      System.out.print(pizza.getName() + " ");
    }
    setTotal(pr);
  }


  public void doAction(Actionable action, Collection<Pizza> pizzas){
    action.doSomethingOperand(this, pizzas);
  }

}
