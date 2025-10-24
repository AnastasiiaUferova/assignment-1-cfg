package com.codefirstgirls.menu;

public class MainDish extends MenuItem {
  public MainDish(String name, double price) {
    super(name, price);
  }

  @Override
  public void getMenuItemSlogan() {
    System.out.println("Your hunger ends here with " + super.getName() + " for " + super.getPrice() + " pln!" );
  }
}
