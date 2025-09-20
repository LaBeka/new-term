package org.example;

import org.example.taskOne.Application;

import org.example.taskTwoRestaurantOrderSystem.Restaurant;

public class Main {

  public static void main(String[] args) {
    Application.ignore();

    Restaurant restaurant = new Restaurant();
    restaurant.initRestaurant();

  }
}