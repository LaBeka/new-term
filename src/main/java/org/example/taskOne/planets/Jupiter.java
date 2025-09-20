package org.example.taskOne.planets;

import java.util.ArrayList;
import java.util.List;
import org.example.taskOne.enums.ActionEnum;

public class Jupiter extends Planet{

  public Jupiter() {
    super("Jupiter");
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
        return 1;
      }
      case EXPLORE -> {
        return 2;
      }
    }
    return 0;
  }

  @Override
  List<String> getStormDamage() {
    return generateDamage(2);
  }

  private List<String> generateDamage(int i) {
    List<String> damages = new ArrayList<String>();
    String jupiterCodeDamage = "\u2643";
    for (int j = 0; j < i; j++) {
      damages.add(jupiterCodeDamage);
    }
    return damages;
  }

  @Override
  List<String>  getAlienDamage() {
    return generateDamage(3);
  }

  @Override
  List<String> getOxygenDamage() {
    return generateDamage(4);
  }


}
