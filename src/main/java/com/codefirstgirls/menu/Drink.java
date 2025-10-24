package com.codefirstgirls.menu;

public class Drink extends MenuItem {

  public Drink(String name, double price){
    super(name, price);
  }

  @Override
  public void getMenuItemSlogan() {
    System.out.println("Good times start with a sip of " + super.getName() +
      '!' + " Only " + super.getPrice() + " pln a cup!" );
  }
}

