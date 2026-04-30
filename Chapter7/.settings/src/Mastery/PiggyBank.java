package Mastery;

public class PiggyBank {
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;

    public PiggyBank() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    public void addPennies(int amount) {
        pennies += amount;
    }

    public void addNickels(int amount) {
        nickels += amount;
    }

    public void addDimes(int amount) {
        dimes += amount;
    }

    public void addQuarters(int amount) {
        quarters += amount;
    }

    public void removePennies(int amount) {
        if (amount <= pennies) pennies -= amount;
        else System.out.println("Not enough pennies!");
    }

    public void removeNickels(int amount) {
        if (amount <= nickels) nickels -= amount;
        else System.out.println("Not enough nickels!");
    }

    public void removeDimes(int amount) {
        if (amount <= dimes) dimes -= amount;
        else System.out.println("Not enough dimes!");
    }

    public void removeQuarters(int amount) {
        if (amount <= quarters) quarters -= amount;
        else System.out.println("Not enough quarters!");
    }

    public double getTotalAmount() {
        return (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
    }
}
