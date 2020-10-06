package cse360assignment02;
/**
 * javadoc comments
 */
public class AddingMachine {

    private int total; // var for holding the totals

    private String history = "0"; // var for storing the history

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    public int getTotal () {
        return total; // returns total
    }

    public void add (int value) {
        total += value;
        history += " + " + value; // adds the value to the total, and records it in var history
    }

    public void subtract (int value) {

        total = total - value;
        history += " - " + value; // subtracts the value to the total, and records it in var history
    }

    public String toString () {

        return history;  // returns the history of the calculator
    }

    public void clear() { // resets total and history to 0
        total = 0;
        history = "0";

    }

}

// https://github.com/cybersewerr/cse360assignment02