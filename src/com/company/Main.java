package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("*************************");
        System.out.println("     Welcome to DnD      ");
        System.out.println("   Character Builder     ");
        System.out.println("*************************");
        UserMenu.start();
    }
}

/*
	Needed classes: - JM

	Menu - this will allow the player to make selections
	CLI - takes input from the customer
	Character - holds fields for character creation
	Dice - rolls die and generate a number for Stats
	Skills - displays skills for each character class
	Weapons - holds weapons
	Race - holds character race info
	Tools - Holds tool info
	Languages - holds info on languages

	Methods needed:

	create - starts new character
	display - shows info requested

*/

