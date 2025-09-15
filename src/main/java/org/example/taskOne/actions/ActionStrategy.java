package org.example.taskOne.actions;

import org.example.taskOne.enums.ActionEnum;
import org.example.taskOne.planets.Planet;
import org.example.taskOne.Player;

public interface ActionStrategy {
  ActionEnum getType();

  void doSomething(Player play, Planet planet);
}
