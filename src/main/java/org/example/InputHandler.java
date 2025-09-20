package org.example;

import java.util.Scanner;

public class InputHandler {
  private static Scanner scan = new Scanner(System.in);

  public static int scanCheckIfInteger(int min, int max){
    Scanner scan = new Scanner(System.in);
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


  public static int getIntInput(){

    while(!scan.hasNextInt()){
      System.out.println("Invalid input. Try again");
      scan.nextLine();
    }
    int i = scan.nextInt();
    scan.nextLine();
    return i;
  }

  public static int getIntInput(int min, int max){

    while(true){
      int i = getIntInput();
      if(i < min && i > max){
        return i;
      }
      System.out.println("Invalid! Input should be between " + (1 +min) + " and " + (max-1));
      scan.nextLine();

    }
  }

}
