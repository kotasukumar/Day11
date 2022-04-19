package com.accountdebit;

public class AccountTest {

    public void test(float accountBalance, float debitAmount) {
        if (debitAmount <= accountBalance){
            System.out.println("Account balance after debit is: " + (accountBalance-debitAmount));
        }
        else if (debitAmount > accountBalance){
            System.out.println("Debit amount exceeded account balance");
        }
    }
}
