package org.example.taskOne.planets;

import java.util.ArrayList;
import java.util.List;
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
  public int gainLifeAsResponseToAction(ActionEnum action) {
    switch (action){
      case ESCAPE -> {
        return 0;
      }
      case GATHER_RESOURCES -> {
        return 3;
      }
      case EXPLORE -> {
        return 2;
      }
    }
    return 0;
  }

  @Override
  List<String> getStormDamage() {
    return generateDamage(1);
  }

  @Override
  List<String> getAlienDamage() {
    return generateDamage(2);
  }

  @Override
  protected List<String> getOxygenDamage() {
    return generateDamage(3);
  }

  private List<String> generateDamage(int i) {
    List<String> damages = new ArrayList<String>();
    String venusCodeDamage = "\u2640";
    for (int j = 0; j < i; j++) {
      damages.add(venusCodeDamage);
    }
    return damages;
  }
}
