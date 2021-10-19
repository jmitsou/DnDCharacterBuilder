package com.company.Job;

import com.company.Dice;

public class JobParent {

    private Dice hitDie;

    public JobParent(Dice hitDie, int typeOfDie) {
        this.hitDie = new Dice(typeOfDie);
    }
}
