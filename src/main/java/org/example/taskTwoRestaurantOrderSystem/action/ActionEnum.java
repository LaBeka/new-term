package org.example.taskTwoRestaurantOrderSystem.action;

public enum ActionEnum {
  SHOW_MENU("ask for menu to choose"),
  ORDER("to order"),
  PAY("to pay"),
  PRINT_RECEIPT("ask receipt"),
  LEAVE("leave"),
  DISPLAY("display");

  private String value;

  ActionEnum(String value) {
    this.value = value;
  }
}
