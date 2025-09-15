package org.example.taskOne.planets;

import org.example.taskOne.enums.ActionEnum;

public class Venus extends Planet{

  public Venus() {
    super("Venus");
  }

  @Override
  public String getLocation() {
    return "You are located in planet: " + super.getName();
  }

  @Override
  public int getLifeAsResponseToAction(ActionEnum action) {
    return 5;
  }

  @Override
  int getStormDamage() {
    return 1;
  }

  @Override
  int getAlienDamage() {
    return 2;
  }

  @Override
  protected int getOxygenDamage() {
    return 3;
  }
}
