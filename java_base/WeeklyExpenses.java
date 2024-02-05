package Java_Base;

import java.util.Random;

public class WeeklyExpenses {
    public static void main (String[] args) {
        Random random = new Random();
        int[] expenses = new int[7];
        int total = 0;

        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(1001); // Генерируем случайное число от 0 до 1000
            total += expenses[i];
            System.out.println("Расходы за день " + (i + 1) + ": " + expenses[i]);
        }

        System.out.println("Сумма трат за неделю: " + total);
    }
}
