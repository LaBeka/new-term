package org.example.taskOne.planets;

import java.util.Random;
import org.example.taskOne.Player;
import org.example.taskOne.enums.ActionEnum;
import org.example.taskOne.enums.RiskEnum;
import org.example.taskOne.actions.ActionStrategy;

public abstract class Planet {
  private String name;


  public Planet(String name) {
    this.name = name;

  }

  public String getName() {
    return name;
  }

  public String getLocation() {
    return name;
  }

  //always give me a value
  abstract int getStormDamage();

  abstract int getAlienDamage();

  //Can give me a value
  protected int getOxygenDamage() { return 3; }

// OTHER WAY OF DOING IT: abstract int getDamage(RiskEnum risk);
//  case 0: { risk = "There is " + RiskEnum.STORM.name; player.setLife(-this.getDamage(RiskEnum.STORM));} break;

  public abstract int getLifeAsResponseToAction(ActionEnum action);

//  public int gainLifeAction(ActionStrategy action){
//    return this.getLifeAsResponseToAction(action.getType());
//  }

  public void takeRisk(Player player){
    Random random = new Random();
    int ch = (int) (random.nextInt(0,4));
    String risk = "";
    switch (ch){
      case 0: { risk = "There is " + RiskEnum.STORM.name + ". You lost " + (-this.getStormDamage()) + "☢\uFE0F life"; player.setLife(-this.getStormDamage());} break;
      case 1: { risk = "There is " + RiskEnum.DANGEROUS_ALIENS.name + ". You lost " + (-this.getAlienDamage()) + "☢\uFE0F life"; player.setLife(-this.getAlienDamage());}break;
      case 2: { risk = "There is " + RiskEnum.lACK_OF_OXYGEN.name + ". You lost " + (-this.getOxygenDamage()) + "☢\uFE0F life"; player.setLife(-this.getOxygenDamage());}break;
      case 3: { risk = "You are lucky, you dodged your risk, no life lost"; } break;
      default: { risk = "invalid risk";}break;
    }
//☢️
    printRisk(risk, player);
  }

  public void printRisk(String risk, Player player){
    System.out.printf(risk + ". Your current life is " + player.getLife() + ".%n");
  }
}
