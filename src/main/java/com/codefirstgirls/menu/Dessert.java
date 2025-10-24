package com.codefirstgirls.menu;

public class Dessert extends MenuItem {

  public Dessert(String name, double price){
    super(name, price);
  }

  @Override
  public void getMenuItemSlogan() {
    System.out.println(super.getName() + "! Satisfy your sugar cravings! Only " + super.getPrice() + " pln!");
  }
}
