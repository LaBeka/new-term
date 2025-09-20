package org.example.taskOne.actions;

import org.example.taskOne.enums.ActionEnum;
import org.example.taskOne.planets.Planet;
import org.example.taskOne.Player;

public class Escape implements Actionable {

  @Override
  public ActionEnum getType() {
    return ActionEnum.ESCAPE;
  }

  @Override
  public void doSomething(Player player, Planet planet) {
    int gainLife = planet.gainLifeAsResponseToAction(this.getType());

    System.out.printf("%n" + player.getName() +
        " is going to escape " + planet.getName() +
        ". As reward to escape from " + player.getName() +
        " is gaining " + gainLife + "❤\uFE0F" +
        "%n");
    player.setLife(gainLife);
  }
}
