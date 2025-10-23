package com.codefirstgirls.menu;

public class Dessert extends MenuItem {

  Dessert(String name, int price){
    super(name, price);
  }

  @Override
  void getMenuItemSlogan() {
    System.out.println(super.getName() + "! Satisfy your sugar cravings!");
  }
}
