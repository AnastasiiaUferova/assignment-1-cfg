package com.codefirstgirls.menu;

public abstract class MenuItem {
  private String name;
  private double price;

  MenuItem(String name, double price){
    this.name =  name;
    this.price = price;
  }

  public abstract void getMenuItemSlogan();

  public double getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
