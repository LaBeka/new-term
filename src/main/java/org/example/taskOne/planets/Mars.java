package org.example.taskOne.planets;

import java.util.ArrayList;
import java.util.List;
import org.example.taskOne.enums.ActionEnum;

public class Mars extends Planet{

  public Mars() {
    super("Mars");
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
        return 2;
      }
      case EXPLORE -> {
        return 3;
      }
    }
    return 0;
  }

  @Override
  List<String> getStormDamage() {
    return generateDamage(4);
  }

  //protected int getOxygenDamage() is defined in abstract class Planet as default
  @Override
  List<String>  getAlienDamage() {
    return generateDamage(5);
  }

  @Override
  List<String> getOxygenDamage() {
    return generateDamage(3);
  }

  private List<String> generateDamage(int i) {
    List<String> damages = new ArrayList<String>();
    String marsCodeDamage = "\u2642";
    for (int j = 0; j < i; j++) {
      damages.add(marsCodeDamage);
    }
    return damages;
  }
}
