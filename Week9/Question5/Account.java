import java.io.*;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private String dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date().toString();
    }

    public Account(int x, double y) {
        id = x;
        balance = y;
        dateCreated = new Date().toString();
    }

    //Mutators
    public void setId(double id) {
        id = id;
    }
    public void setBalance(double balance) {
        balance = balance;
    }
    public void setAnnualInterestRate(double interestRate) {
        annualInterestRate = (interestRate/100);
    }
    public void setDateCreated(long date) {
        dateCreated = new Date(date).toString();
    }

    //Accessors
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate*100;
    }
    public String getDateCreated() {
        return dateCreated;
    }

    //Methods
    public double getMonthlyInterestRate() {
        return (annualInterestRate*100/12);
    }
    public double getMonthlyInterest() {
        return (annualInterestRate/12)*balance;
    }
    //Withdrawing
    public void withdraw(double withdrawAmount) {
        balance = balance - withdrawAmount;
    }
    //Deposit
    public void deposit(double deposit) {
        balance = balance + deposit;
    }
}
