package edu.mediacampus.pam.melken;

/**
 * Created with IntelliJ IDEA.
 * User: retokiefer
 * Date: 13.12.12
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
public class Kuh {

    private int milch;
    private boolean gemolken = false;

    Kuh () {
        this.milch = 8;
    }

    Kuh (int i) {
        this.milch = i;
    }

    public int werdeGemolken() {
        this.milch--;
        if(milch == 0) {
            gemolken = true;
        }

        return this.milch;
    }

    public boolean isGemolken() {
        return gemolken;
    }

    public void setGemolken(boolean gemolken) {
        this.gemolken = gemolken;
    }

    public int getMilch() {
        return milch;
    }

    public void setMilch(byte milch) {
        this.milch = milch;
    }

    public String toString() {

        String antwort = "Die Kuh hat noch " + milch + " Liter Milch.";

        if(gemolken == true) {
            antwort += "Und sie wurde bereits gemolken."; // antwort = antwort + "Und sie wurde bereits gemolken.";
        }
        else {
            antwort += "Und sie wurde noch nicht gemolken.";
        }

        return antwort;
    }
}
