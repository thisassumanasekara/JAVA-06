package com.mycompany.bankaccountmain;

public class BankAccountmain {

    public static void main(String[] args) 
    {
        CheckingAccount checking = new CheckingAccount(123456, 1000000);
        SavingsAccount savings = new SavingsAccount();

        double checkingInterest = checking.calculateInterest();
        double savingsInterest = savings.calculateInterest();

        System.out.println("Interest for Checking Account: $" + checkingInterest);
        System.out.println("Interest for Savings Account: $" + savingsInterest);
    }
}
