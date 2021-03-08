package com.company;

import com.company.Score;
import com.company.Transaction;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Transaction> transactions;
    private final double PURCHASE_PRICE = 100;
    private final double SALE_PRICE = 200;

    public User() {
        this.transactions = new ArrayList<>();
    }

    //Ввод начальных значений
    public void inputInitialBalance(double amount) {
        transactions.add(new Transaction(0, 0, amount, Score.CASHIER, Score.DEFAULT));
    }

    //Мы оплатили горшки
    public void purchase(int count) {
        transactions.add(new Transaction(count, 0, count * PURCHASE_PRICE, Score.PAYMENT_SUPPLIERS, Score.CASHIER));
    }

    //Нам привезли горшки
    public void get_pots(int count) {
        transactions.add(new Transaction(count, 0, count * PURCHASE_PRICE, Score.PRODUCTS, Score.PAYMENT_SUPPLIERS));
    }

    //Мы оплатили горшки
    public void payment_pots(int count) {
        transactions.add(new Transaction(count, 0, count * PURCHASE_PRICE, Score.PAYMENT_SUPPLIERS, Score.CASHIER));
    }

    //Мы списали горшки
    public void writeOff(int count) {
        transactions.add(new Transaction(0, count, count * PURCHASE_PRICE, Score.COST_PRICE, Score.PRODUCTS));
    }

    //отгрузили горшки
    public void shipped_pots(int count) {
        transactions.add(new Transaction(count, 0, count * SALE_PRICE, Score.PAYMENT_BUYERS, Score.COST_PRICE));
    }

    //Нам оплатили горшки
    public void paid_pots(int count) {
        transactions.add(new Transaction(0, count, count * SALE_PRICE, Score.CASHIER, Score.PAYMENT_BUYERS));
    }

    //отчет
    public void report() {
        System.out.println("Debit" + "   Quantity" + "  Credit" + "  Quantity" + "  Amount");
        for (Transaction transaction: transactions){
            transaction.demonstrateTransaction();
        }
    }
}
