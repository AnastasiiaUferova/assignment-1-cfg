package com.codefirstgirls.util;

import com.codefirstgirls.constants.MenuItemConstants;
import com.codefirstgirls.menu.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class MenuItemGenerator {

  private static MenuItem generateSingleMenuItem(MenuPosition type, String name, double price) {
    return switch (type) {
      case MenuPosition.DRINK -> new Drink(name, price);
      case MenuPosition.MAIN_DISH -> new MainDish(name, price);
      case MenuPosition.DESSERT -> new Dessert(name, price);
    };
  }

  private static MenuItem getRandomNamePrice(MenuPosition type) {
    Map<String, Double> positions = MenuItemConstants.getMenuPositions(type);
    ArrayList<Map.Entry<String, Double>> entries = new ArrayList<>(positions.entrySet());

    Random random = new Random();
    int index = random.nextInt(entries.size());

    Map.Entry<String, Double> entry = entries.get(index);
    String name = entry.getKey();
    double price = entry.getValue();
    return generateSingleMenuItem(type, name, price);
  }

  public static MenuItem[] generateMultipleMenuItems(String type, int number){
    MenuItem[] menuItemArray = new MenuItem[number];

    for (int i = 0; i < number; i++){
        menuItemArray[i] = getRandomNamePrice(MenuPosition.valueOf(type));
      }
      return menuItemArray;
  }
}
