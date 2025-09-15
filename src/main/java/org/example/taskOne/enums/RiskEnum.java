package org.example.taskOne.enums;

public enum RiskEnum {
  lACK_OF_OXYGEN("lack of oxygen"),
  STORM("storm"),
  DANGEROUS_ALIENS("dangerous aliens");

  public String name;

  RiskEnum(String name) {
    this.name = name;
  }
}
