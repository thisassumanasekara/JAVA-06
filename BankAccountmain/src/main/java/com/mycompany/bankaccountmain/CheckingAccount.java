package com.mycompany.bankaccountmain;

public class CheckingAccount extends BankAccount
{
    public static final double interest=0.12;
    public CheckingAccount (int accno, double balance);
    {
        super(accno, balance);
    }
    @Override
    public double calculateInterest()
    {
        return getbalance()*interest;
    }
}
