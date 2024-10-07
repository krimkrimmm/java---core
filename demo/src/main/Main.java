package main;

import entities.Customer;
import view.MainMenu;

public class Main {

    public static Customer LOGGED_IN_CUSTOMER = null;

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.initializeData();
        mainMenu.menu();
    }
}




