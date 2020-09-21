package com.chef.code;

// https://www.codechef.com/problems/HS08TEST

public class ATM {

  public static void main(String[] args) {

    double balance = 8;
    balance = withdraw(5, balance);
    System.out.println(balance);
    balance = withdraw(5, balance);
    System.out.println(balance);
  }

  private static double withdraw(int amountToWithdraw, double balance) {
    // logic rules given by problem
    if (amountToWithdraw < 0 || balance < 0 || amountToWithdraw > 2000 || balance > 2000)
      System.exit(-1);

    double newBalance;

    if (amountToWithdraw % 5 == 0 && amountToWithdraw <= balance && balance != 0) {
      newBalance = balance - amountToWithdraw - .50;
      if (newBalance < 0) {
        return balance;
      }
      return newBalance;
    }

    return balance;
  }

}
