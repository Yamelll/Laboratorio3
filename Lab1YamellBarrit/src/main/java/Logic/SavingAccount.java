package Logic;

import Domain.Client;

public class SavingAccount extends Account {

    private String startDate;
    private int monthsNumber;
    private float interest;

    public SavingAccount(String startDate, int monthsNumber, float interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.startDate = startDate;
        this.monthsNumber = monthsNumber;
        this.interest = interest;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getMonthsNumber() {
        return monthsNumber;
    }

    public void setMonthsNumber(int monthsNumber) {
        this.monthsNumber = monthsNumber;
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
        interestTotal = this.getMonthsNumber()
                * super.getBalance()
                * this.getInterest();
        return super.getBalance() + interestTotal;
    }
    
    public String toString() {
        String result = "\nACCOUNT TYPE: SAVING ACCOUNT"
                + "\nSaving Start Date: " + this.getStartDate()
                + "\nMonths: " + this.getMonthsNumber()
                + "\nInterest: " + this.getInterest() + "%"
                + "\nInterest you got: " +
                                    (this.getMonthsNumber()
                                    + super.getBalance()
                                    + this.getInterest()
                                    /100)
                + "\nStart Date + Interest Won: " + this.interestCalculation();
        return super.toString() + result;
    }
}