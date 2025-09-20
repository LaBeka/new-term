package org.example.taskOne;

import java.util.Scanner;
import org.example.InputHandler;
import org.example.taskOne.actions.Escape;
import org.example.taskOne.actions.Explore;
import org.example.taskOne.actions.Gather_Resources;
import org.example.taskOne.enums.ActionEnum;
import org.example.taskOne.planets.Jupiter;
import org.example.taskOne.planets.Mars;
import org.example.taskOne.planets.Planet;
import org.example.taskOne.planets.Venus;

public class Application {
  private static Scanner scan = new Scanner(System.in);

  public static void ignore() {
    System.out.println("*********");
  }

  public static void initPlanets(){
    //1. Initialize the player
    Player player = new Player("Pelle");
    System.out.printf("Welcome to explore planets " + player.getName() + "!%n");

    run(player);
  }
  private static void run(Player player) {
    System.out.printf("You got " + player.getLife() + " life%n");

      while(true) {
        System.out.println(
            "==================================Next round==================================");
        System.out.printf("Choose one of the planets to go to%n"
            + "Enter 1 to go to Venus%n"
            + "Enter 2 to go to Mars%n"
            + "Enter 3 to go to Jupiter%n"
            + "Enter 4 to quit game%n");
        // 2. choose planet
        int planetChoice = InputHandler.scanCheckIfInteger(1, 4);

        switch (planetChoice) {
          case 1:
//            Planet venus = new Venus();
            visitPlanet(player, new Venus());
            break;
          case 2:
            visitPlanet(player, new Mars());
            break;
          case 3:
            visitPlanet(player, new Jupiter());
            break;
          case 4:
            System.out.printf("Chosen: Stop game%n");
            System.exit(0);
            break;
          default:
            System.out.printf("Invalid input. Try again%n");
            break;
        }
      }
  }


  private static void visitPlanet(Player player, Planet planet) {
    System.out.printf(planet.getLocation()+ "%n");

    //Player gets risk randomly-is unique to all planets
    planet.takeRisk(player);

    System.out.printf("Choose an action, what do you want to do in " + planet.getName() + "%n"
        + "Enter 1 to " + ActionEnum.EXPLORE.action + "%n"
        + "Enter 2 to " + ActionEnum.GATHER_RESOURCES.action + "%n"
        + "Enter 3 to " + ActionEnum.ESCAPE.action + "%n");

    int actionChoice = InputHandler.scanCheckIfInteger(1,3);

    //3. do something in chosen planet - STRATEGY PATTERN DESIGN
    switch (actionChoice) {
      case 1:
        player.doSomethingInPlanet(new Explore(), planet);
        break;
      case 2:
        player.doSomethingInPlanet(new Gather_Resources(), planet);
        break;
      case 3:
        player.doSomethingInPlanet(new Escape(), planet);
        break;
      default:
        break;
    }
  }
}
