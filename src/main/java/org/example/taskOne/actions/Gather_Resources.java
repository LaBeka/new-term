package org.example.taskOne.actions;

import org.example.taskOne.enums.ActionEnum;
import org.example.taskOne.planets.Planet;
import org.example.taskOne.Player;

public class Gather_Resources  implements ActionStrategy{

  @Override
  public ActionEnum getType() {
    return ActionEnum.GATHER_RESOURCES;
  }

  @Override
  public void doSomething(Player player, Planet planet) {
    int gainLife = planet.getLifeAsResponseToAction(this.getType());

    System.out.printf("%n" + player.getName() +
        " is going to gather resources in " +
        planet.getName() +
        ". As reward to gather resources " + player.getName() +
        " is gaining " + gainLife + "❤\uFE0F" +
        "%n");

    player.setLife(gainLife);
  }
}
