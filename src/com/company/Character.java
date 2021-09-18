package com.company;

import java.util.ArrayList;

public class Character {

    public ArrayList<Character> player;

    private String name;
    private int hitPoints;

    public Character(String name, int hp) {
        this.name = name;
        this.hitPoints = hp;
    }


}
