package org.example.taskOne.planets;

public class Mars extends Planet{

  public Mars() {
    super("Mars");
  }

  @Override
  public String getLocation() {
    return "You are located in planet: " + super.getName();
  }

  @Override
  public int getLifeAsResponseToAction() {
    return 4;
  }

  @Override
  int getStormDamage() {
    return 4;
  }

  @Override
  int getAlienDamage() {
    return 5;
  }
}
