package com.accountdebit;

import java.util.Scanner;

public class Account {

    public static void main(String[] args) {
        System.out.println("Welcome to account debit program");

        float accountBalance = 5000;
        System.out.println("Enter the amount you want to debit:");
        Scanner scanner = new Scanner(System.in);
        float debitAmount = scanner.nextFloat();
        AccountTest accountTest = new AccountTest();
        accountTest.test(accountBalance, debitAmount);
    }
}
