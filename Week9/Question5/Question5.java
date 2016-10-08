//import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class Question5 {
  public static void main(String[] args) {
      test1();
  }

  public static void test1() {
      Account me1 = new Account(1122, 20000.0);
      System.out.println("User ID: " + me1.getId());
      me1.setAnnualInterestRate(4.5);
      me1.withdraw(2500);
      System.out.println("Current Balance is: $" + me1.getBalance());
      me1.deposit(3000);
      System.out.println("Current Balance is: $" + me1.getBalance());
      System.out.println("Annual Interest is: " + me1.getAnnualInterestRate() + "%");
      System.out.println("Account was created: " + me1.getDateCreated());
      System.out.println("Monthly Interest Rate is: " + me1.getMonthlyInterestRate() + "%");
      System.out.println("Monthly Interest is: $" + me1.getMonthlyInterest());

  }
}
