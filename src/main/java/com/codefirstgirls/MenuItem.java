package com.codefirstgirls;

public abstract class MenuItem {
  String name;
  int basePrice;
  int currentPrice;

  MenuItem(String name, int price){
    this.name =  name;
    this.basePrice = price;
    this.currentPrice = basePrice;
  }

  abstract void getMenuItemSlogan();

  public void makeDiscount(){
    CurrentDiscount currentDiscount = new CurrentDiscount();
    int discountValue = currentDiscount.getDiscount();

    if(discountValue > 0){
      System.out.println("Your discount is " + discountValue + "%!");
    }
    else{
      System.out.println("Price is not discounted at the time");
    }
    this.currentPrice = (int) (basePrice - (basePrice * (discountValue * 0.01)));
  }

  public void removeDiscount(){
    this.currentPrice = this.basePrice;
  };

  public int getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(int basePrice) {
    this.basePrice = basePrice;
  }
}
