package org.example.taskOne;

import java.util.Scanner;
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

  public static void initPlanets(){
    Player player = new Player("Pelle");
    System.out.printf("Welcome to explore planets " + player.getName() + "!%n");

    run(player);
  }
  private static void run(Player player) {
    System.out.printf("You got " + player.getLife() + " life%n");

    while(player.getLife() > 0) {
      System.out.println("==================================Next round==================================");
      System.out.printf("Choose one of the planets to go to%n"
          + "Enter 1 to go to Venus%n"
          + "Enter 2 to go to Mars%n"
          + "Enter 3 to go to Jupiter%n"
          + "Enter 4 to quit game%n");

      int planetChoice = scanCheckIfInteger(1, 4);

      switch (planetChoice) {
        case 1:
          Planet venus = new Venus();
          doAction(player, venus);
          break;
        case 2:
          Planet mars = new Mars();
          doAction(player, mars);
          break;
        case 3:
          Planet jupiter = new Jupiter();
          doAction(player, jupiter);
          break;
        case 4:
          System.out.printf("Chosen: Stop game%n");
          System.exit(0);
          break;
        default:
          System.out.printf("Invalid input. Try again%n");
          break;
      }
      System.out.printf("You have " + player.getLife() + " left life%n");

    }
  }

  private static void doAction(Player player, Planet planet) {
    System.out.printf(planet.getLocation()+ "%n");
    planet.takeRisk(player);
    System.out.printf("Choose an action, what do you want to do in " + planet.getName() + "%n"
        + "Enter 1 to " + ActionEnum.EXPLORE.action + "%n"
        + "Enter 2 to " + ActionEnum.GATHER_RESOURCES.action + "%n"
        + "Enter 3 to " + ActionEnum.ESCAPE.action + "%n");

    int actionChoice =  scanCheckIfInteger(1,3);

    //STRATEGY PATTERN DESIGN
    switch (actionChoice) {
      case 1:
        player.doSomething(new Explore(), planet);
        break;
      case 2:
        player.doSomething(new Escape(), planet);
        break;
      case 3:
        player.doSomething(new Gather_Resources(), planet);
        break;
      default:
        break;
    }
  }

  private static int scanCheckIfInteger(int min, int max){
    String input = scan.nextLine();
    int result = 10;
    try {
      input = input.replaceAll("\\D", "");
      result = Integer.parseInt(input);
      if (input.length() == 0) {
        System.out.println("Invalid input. Try again");
        scanCheckIfInteger(min, max);
      } else if (result < min || result > max) {
        System.out.println("Invalid input. Try again between the numbers: "
            + min + " and " + max);
        return scanCheckIfInteger(min, max);
      }

    } catch (Exception e){
      System.out.println("Invalid input. Try again");
      return scanCheckIfInteger(min, max);
    }
    return result;
  }
}
