package com.codefirstgirls.constants;

import com.codefirstgirls.menu.MenuPosition;

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

  private static final Map<String, Double> dishes = new HashMap<>();
  private static final Map<String, Double> drinks = new HashMap<>();
  private static final Map<String, Double> desserts = new HashMap<>();

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

  public static Map<String, Double> getMenuPositions (MenuPosition type){
    return switch(type){
      case MenuPosition.MAIN_DISH -> dishes;
      case MenuPosition.DESSERT -> desserts;
      case MenuPosition.DRINK -> drinks;
    };
  }

}
