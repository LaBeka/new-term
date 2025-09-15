package org.example.taskOne.planets;

import java.util.Random;
import org.example.taskOne.Player;
import org.example.taskOne.enums.RiskEnum;

public class Jupiter extends Planet{

  public Jupiter() {
    super("Jupiter");
  }

  @Override
  public String getLocation() {
    return "You are located in planet: " + super.getName();
  }

  @Override
  public int getLifeAsResponseToAction() {
    return 3;
  }

  @Override
  int getStormDamage() {
    return 2;
  }

  @Override
  int getAlienDamage() {
    return 3;
  }

  @Override
  protected int getOxygenDamage() {
    return 4;
  }

  public void takeRisk(Player player){
    Random random = new Random();
    int ch = (int) (random.nextInt(0,4));
    String risk = "";
    switch (ch){
      case 0: { risk = "There is " + RiskEnum.STORM.name; player.setLife(-1);} break;
      case 1: { risk = "There is " + RiskEnum.DANGEROUS_ALIENS.name; player.setLife(-2);}break;
      case 2: { risk = "There is " + RiskEnum.lACK_OF_OXYGEN.name; player.setLife(-3);}break;
      case 3: { risk = "You are lucky, you dodged you the risk, no life lost!"; } break;
      default: { risk = "invalid risk";}break;
    }

    printRisk(risk, player);
  }

  public void printRisk(String risk, Player player){
    System.out.printf(risk + ". You lost some life. Your current life is " + player.getLife() + ".%n");
  }

}
