package com.codefirstgirls.menu;

public class Drink extends MenuItem {

  Drink(String name, int price){
    super(name, price);
  }

  @Override
  void getMenuItemSlogan() {
    System.out.println("Good times start with a sip of " + super.getName() + '!');
  }
}

