package Logic;

import Domain.Client;

public abstract class Account {

    protected String accountNumber;
    protected double balance;
    protected Client client;

    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    //Methods in order to represent the polimorfism
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract double interestCalculation();

    public String toString() {
        String result = "BANK ACCOUNT INFORMATION:"
                + "\n -------------------------------"
                + "\n Account Number: " + this.getAccountNumber()
                + "\n Balance: " + this.getBalance()
                + "\n Account Owner: " + this.getClient().toString();
return result;
    }
}