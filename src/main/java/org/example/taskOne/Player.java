package org.example.taskOne;

import java.util.Random;
import org.example.taskOne.actions.ActionStrategy;
import org.example.taskOne.planets.Planet;

public class Player {
  private static Random random = new Random();
  private int life;
  private String name;

  public Player(String name) {
    this.name = name;
    this.life = random.nextInt(3, 10);
  }

  public String getName() {
    return name;
  }

  public int getLife() {
    return life;
  }

  public void setLife(int life) {
    this.life += life;
  }

  public void doSomething(ActionStrategy action, Planet planet){
    action.doSomething(this, planet);
  }
}
