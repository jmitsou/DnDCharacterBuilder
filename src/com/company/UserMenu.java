package com.company;

import com.company.Job.Paladin;

import java.util.ArrayList;

public class UserMenu {

    public static ArrayList<Character> player = new ArrayList<>();

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
           // System.out.println("Opens character creation menu");
            characterMenu();
        }else if (sel == 2){
            System.out.println("shows list of created characters");
            for (int i = 0; i < player.size(); i++) {
                player.get(i);
            }
        }

    }

    public static void subMenu(){

    }

    public static void characterMenu(){

        String name = CLI.getStr("Enter a Name for your Character.\n");
        System.out.println("Okay, " + name + ", nice to meet you.");
        System.out.println("Display Races");
        String race = CLI.getStr("What is your character's Race.\n");
        System.out.println("Great so you are a " + race + ".");
        System.out.println("Display Classes");
        String job = CLI.getStr("What is your character's Class.\n");
        System.out.println("So you are a " + race + ", " + job + " so now we can roll for your stats");

        //Create and add charcter to player arrayList
        Character newCharacter = new Character(name,race,job,0);
        player.add(newCharacter);


    }


    public static class Backpack {

    }
}
