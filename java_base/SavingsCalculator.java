package Java_Base;

import java.util.Scanner;

public class SavingsCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стартовый баланс счета: ");
        double balance = scanner.nextDouble();

        double target = 100000;
        double interesRate = 0.1;
        int years =0;

        while (balance < target) {
            balance += balance * interesRate;
            years++;
        }
        System.out.println("Вам потребуется " + years + " лет, чтобы накопить " + target + " рублей.");
    }
}
