package com.company;

import java.util.ArrayList;

public class Character {

    private String characterName;
    private String characterRace;
    private String characterJob;
    private int hitPoints;

    public Character(String characterName, String characterRace, String characterJob, int hitPoints) {
        this.characterName = characterName;
        this.characterRace = characterRace;
        this.characterJob = characterJob;
        this.hitPoints = hitPoints;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(String characterRace) {
        this.characterRace = characterRace;
    }

    public String getCharacterJob() {
        return characterJob;
    }

    public void setCharacterJob(String characterJob) {
        this.characterJob = characterJob;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }


}
