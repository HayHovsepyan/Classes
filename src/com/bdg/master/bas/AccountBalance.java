package com.bdg.master.bas;


public final class AccountBalance {
    private double balance;

    public AccountBalance(final double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(final double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(final double amount) {
        this.balance = this.balance - amount;
    }
}
