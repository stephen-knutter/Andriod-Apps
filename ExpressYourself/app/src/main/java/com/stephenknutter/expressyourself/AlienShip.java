package com.stephenknutter.expressyourself;

import android.util.Log;

public abstract class AlienShip {
    private static int numShips;
    private int shieldStrength;
    public String shipName;

    public AlienShip(int shieldStrength) {
        Log.i("Location: ", "AlienShip constructor");
        numShips++;
        setShieldStrength(shieldStrength);
    }

    public abstract void fireWeapon();

    public static int getNumShips() {
        return numShips;
    }

    private void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public int getShieldStringth() {
        return this.shieldStrength;
    }

    public void hitDetected() {
        shieldStrength -= 25;
        Log.i("Incoming: ", "Bam!");
        if (shieldStrength == 0) {
            destroyShip();
        }
    }

    private void destroyShip() {
        numShips--;
        Log.i("Explosion: ", "" + this.shipName + " destroyed");
    }
}
