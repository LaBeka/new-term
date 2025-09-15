package org.example.taskOne.enums;

public enum ActionEnum {
  EXPLORE("explore"),
  GATHER_RESOURCES("gather resources"),
  ESCAPE("escape");

  public String action;

  ActionEnum(String action) {
    this.action = action;
  }
}
