package Logic;

import Domain.Client;

public class CurrentAccount extends Account {

    private float interest;

    public CurrentAccount(float interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(interestCalculation() + amount);
    }

    @Override
    public void withdraw(double amount) {
        super.setBalance(interestCalculation() - amount);
    }

    @Override
    public double interestCalculation() {
        double interestTotal = 0;
        interestTotal = this.getInterest();
        return interestTotal;
    }
    
    public String toString() {
        String result = "ACCOUNT TYPE: CURRENT ACCOUNT"
                + "Interest: " + this.getInterest() + "%"
                + "\nInterest you got: " + this.getInterest() / 10
                + "\nInterest you won: " + this.interestCalculation();
        return super.toString() + result;
    }
}