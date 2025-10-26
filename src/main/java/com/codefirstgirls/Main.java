package com.codefirstgirls;

import com.codefirstgirls.menu.MenuItem;
import com.codefirstgirls.menu.MenuPosition;

import java.util.Arrays;
import java.util.Scanner;

import static com.codefirstgirls.util.MenuItemGenerator.generateMultipleMenuItems;


public class Main {

    private static final Scanner scanner = new Scanner(System.in); // Scanner class is used to get user input

    public static void main(String[] args) {
      System.out.println("WELCOME TO THE OBJECT GENERATOR");
      System.out.println("*******************************");
      System.out.println("PLEASE ENTER ONE OF THE FOLLOWING MENU POSITIONS OBJECTS TO CREATE");

      for (var i = 0; i < MenuPosition.values().length; i++) {
        System.out.println(i + 1 + ". " + MenuPosition.values()[i]);
      }

      String menuChoice;
      while (true) {
        menuChoice = scanner.nextLine().toUpperCase();
        String finalMenuChoice = menuChoice;
        boolean validChoice = Arrays.stream(MenuPosition.values())
          .anyMatch(position -> position.name().equals(finalMenuChoice));
        if (validChoice) {
          break;
        }
        System.out.println("PLEASE, ENTER ONE OF THE POSITIONS");
      }

      int menuPositionNumber = (MenuPosition.valueOf(menuChoice).ordinal() + 1);

      System.out.println("THANKS FOR CHOOSING OPTION " + menuPositionNumber
        +": " + menuChoice + "!");
      System.out.println("HOW MANY OF OPTION " + menuPositionNumber + " WOULD YOU LIKE TO CREATE?");

      String amountToCreate;
      while (true) {
        amountToCreate = scanner.nextLine();
        try {
          int parsedNumber = Integer.parseInt(amountToCreate);
          if(parsedNumber > 0){
            System.out.println("THANKS! LETS CREATE THAT!");
            System.out.println("YOU’VE CREATED " + amountToCreate + ' ' +  menuChoice);

            System.out.println("YOUR " + menuChoice + "’S NAMES AND PRICES ARE AS FOLLOWS (+ a little slogan!):" );
            MenuItem[] menuItemsToDisplay = generateMultipleMenuItems(menuChoice,  parsedNumber);
            for(MenuItem item : menuItemsToDisplay){
              item.getMenuItemSlogan();
            }
            break;
          }
          else{
            System.out.println("PLEASE ENTER A POSITIVE NUMBER.");
          }

        } catch (NumberFormatException e) {
          System.out.println("PLEASE ENTER A VALID POSITIVE NUMBER.");
        }

      }

    }
}
