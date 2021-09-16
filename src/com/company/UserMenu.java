package com.company;

public class UserMenu {

    public static void start(){

        System.out.println("\nWelcome to our character builder. Here you can create a character and customize them " +
                "and eventually enter them in a campaign");

        System.out.println("\nPlease chose an option: ");
        System.out.println("\n1) Create a Character ");
        System.out.println("2) Delete a Character ");
        System.out.print("\nChoice: ");
        int choice = CLI.getNum(1,2);
        mainMenu(choice);

    }

    public static void mainMenu(int sel){
        if (sel == 1){
            System.out.println("Opens character creation menu");
        }else if (sel == 2){
            System.out.println("shows list of created characters");
        }
    }

    public static void subMenu(){

    }

    public static void characterMenu(){

    }


    public static class Backpack {

    }
}
