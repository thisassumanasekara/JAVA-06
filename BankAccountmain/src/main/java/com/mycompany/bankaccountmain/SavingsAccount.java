package com.mycompany.bankaccountmain;

public abstract class SavingsAccount extends BankAccount
{
    public static final double interest=0.12;
    public SavingsAccount (int accno, double balance);
    {
        super(accno, balance);
    }
    public double calculateInterest()
    {
        return getbalance()*interest;
    }
}

