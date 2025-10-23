package com.codefirstgirls;

public class MainDish extends MenuItem{
  MainDish(String name, int price) {
    super(name, price);
  }

  @Override
  void getMenuItemSlogan() {
    System.out.println("Your hunger ends here with " + name + '!');
  }
}
