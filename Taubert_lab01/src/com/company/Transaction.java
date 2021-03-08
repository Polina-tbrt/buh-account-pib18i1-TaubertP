package com.company;

import com.company.Score;

public class Transaction {
    public int debit;
    public int credit;
    public double sum;
    public Score debit_score;
    public Score credit_score;

    public Transaction(int debit, int credit, double sum, Score debit_score, Score credit_score) {
        this.credit = credit;
        this.debit = debit;
        this.sum = sum;
        this.debit_score = debit_score;
        this.credit_score = credit_score;
    }

    public void demonstrateTransaction(){
        System.out.println(this.debit+ " " + this.debit_score + " " + this.credit + " " + this.credit_score + " " + sum);
    }

}
