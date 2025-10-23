package com.codefirstgirls;

public class Dessert extends MenuItem{

  Dessert(String name, int price){
    super(name, price);
  }

  @Override
  void getMenuItemSlogan() {
    System.out.println(name.toUpperCase() + "! Satisfy your sugar cravings!");
  }
}
