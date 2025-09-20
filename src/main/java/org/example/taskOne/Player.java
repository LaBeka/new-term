package org.example.taskOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;
import org.example.taskOne.actions.Actionable;
import org.example.taskOne.planets.Planet;

@Getter @Setter
public class Player {
  private static Random random = new Random();
  private int life;
  private String name;
  private List<String> damages;

  public Player(String name) {
    this.name = name;
    this.life = random.nextInt(3, 10);
    this.damages = new ArrayList<String>();
  }

  public void setDamages(List<String> damage) {
    for (int i = 0; i < damage.size(); i++) {
      this.damages.add(damage.get(i));
      setLife(-1);
    }
  }

  public void setLife(int num) {
    this.life += num;
    checkLifeViabilityDuringGame();
  }

  public void doSomethingInPlanet(Actionable actionable, Planet planet){
    actionable.doSomething(this, planet);
  }


  private void checkLifeViabilityDuringGame(){
    if(this.life <= 0) {
      System.out.printf("You have " + this.life + " life%nGame exit");
      System.exit(0);
    }
  }
}
