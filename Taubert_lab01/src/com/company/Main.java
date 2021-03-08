package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();

        Scanner sc = new Scanner(System.in);
        int m;
        do {
            System.out.println("1. Список операций");
            System.out.println("2. Ввод начальных остатков");
            System.out.println("3. Покупка горшков");
            System.out.println("4. Прием горшков");
            System.out.println("5. Отчет");
            System.out.println("6. Выход");
            m = sc.nextInt();
            double sum;
            int count;
            switch (m) {
                case 1:
                    System.out.println("number_debit" + "   Debit" + "   number_credit" + "   Credit" + "   Amount");
                    for (Transaction transaction : user.transactions) {
                        System.out.println(transaction.debit_score + " " + transaction.debit + " " +
                                transaction.credit_score + " " + transaction.credit + " " + transaction.sum);
                    }
                    break;
                case 2:
                    System.out.println("Введите сумму");
                    sum = sc.nextDouble();
                    user.inputInitialBalance(sum);
                    break;
                case 3:
                    System.out.println("Введите количество горшков");
                    count = sc.nextInt();
                    user.purchase(count);
                    break;
                case 4:
                    System.out.println("Введите количество горшков");
                    count = sc.nextInt();
                    user.get_pots(count);
                    break;
                case 5:
                    System.out.println("Отчет");
                    user.report();
                    break;
                case 6:
                    System.out.println("Выход");
            }
        }
        while (m != 6);

    }
}
