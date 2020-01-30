package net.pl3x.encapsulation;

public class Account {
    private float balance;

    public void deposit(float amount) {
        // Three different ways to implement the objective
        // this.balance = this.balance + amount;
        // this.balance += amount;
        if (amount > 0) {
            balance += amount;
        }
    }

    /* A better way of obtaining this is with withdraw(){ }
    public void setBalance(float balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }
    */

    public void withdraw(float amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public float getBalance() {
        return balance;
    }
}
