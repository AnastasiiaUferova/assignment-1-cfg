package com.codefirstgirls;

import com.codefirstgirls.constants.MenuItemConstants;
import com.codefirstgirls.menu.MenuPosition;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); // Scanner class is used to get user input

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE OBJECT GENERATOR");
        System.out.println("*******************************");
        System.out.println("PLEASE ENTER ONE OF THE FOLLOWING MENU POSITIONS TO CREATE");

      for(var i = 0; i < MenuPosition.values().length; i++){
        System.out.println(i+1 + ". " + MenuPosition.values()[i]);
      }

        String menuChoice = scanner.nextLine();


        System.out.println("THANKS! HOW MANY WOULD YOU LIKE TO CREATE?");
        String amountToCreate = scanner.nextLine();

        // create the items, and output to the user as appropriate
      MenuItemConstants menuUtil = new MenuItemConstants();
      System.out.println(menuUtil.getDishes());

    }
}
