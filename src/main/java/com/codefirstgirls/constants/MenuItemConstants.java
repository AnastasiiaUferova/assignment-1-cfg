package com.codefirstgirls.constants;

import java.util.HashMap;
import java.util.Map;

public class MenuItemConstants {
  private static final String[] dishNames = {
    "Pumpkin Spice Pasta",
    "Maple Glazed Chicken",
    "Harvest Veggie Stew",
    "Crispy Apple Pork",
    "Golden Squash Risotto"
  };

  private static final double[] dishPrices = {
    23,
    21.9,
    45,
    30.1,
    33.9
  };

  private static final String[] drinkNames = {
    "Cinnamon Chai Latte",
    "Caramel Apple Cider",
    "Pumpkin Spice Smoothie",
    "Maple Latte",
    "Autumn Breeze Mocktail"
  };

  private static final double[] drinkPrices = {
    23.5,
    44.3,
    43,
    30.9,
    46
  };

  private static final String[] dessertNames = {
    "Pecan Pie Delight",
    "Maple Walnut Brownie",
    "Pumpkin Cheesecake",
    "Apple Crisp Crumble",
    "Spiced Caramel Tart"
  };

  private static final double[] dessertPrices = {
    23.0,
    21.5,
    45.5,
    30.0,
    43,
  };

  private static final Map<String, Double> dishes = new HashMap<String, Double>();
  private static final Map<String, Double> drinks = new HashMap<String, Double>();
  private static final Map<String, Double> desserts = new HashMap<String, Double>();

  static private void CreateMenuMap(String[] names, double[] prices, Map<String, Double> dishWithPrices){
    for(int i = 0; i < names.length; i++){
      dishWithPrices.put(names[i], prices[i]);
    }
  }

  static{
    CreateMenuMap(dishNames, dishPrices, dishes);
    CreateMenuMap(drinkNames, drinkPrices, drinks);
    CreateMenuMap(dessertNames, dessertPrices, desserts);
  }

  public Map<String, Double> getDishes(){
    return dishes;
  }

  public Map<String, Double> getDrinks(){
    return drinks;
  }

  public Map<String, Double> getDesserts() {
    return desserts;
  }
};

