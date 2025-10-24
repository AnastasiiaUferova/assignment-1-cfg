package com.codefirstgirls.menu;

public abstract class MenuItem {
  private String name;
  private double price;

  MenuItem(String name, int price){
    this.name =  name;
    this.price = price;
  }

  public void removeDiscount(){
    this.currentPrice = this.basePrice;
  };

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
