package Exam1;
import java.util.Scanner;


public class Main {
    private static final int DAYS = 30;
    private static int[] expenses = new int[DAYS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню:");
            System.out.println("1 – Ввести расходы за определенный день");
            System.out.println("2 – Траты за месяц");
            System.out.println("3 – Самая большая сумма расхода за месяц");
            System.out.println("0 – Выход");
            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    enterExpense(scanner);
                    break;
                case 2:
                    printExpenses();
                    break;
                case 3:
                    printMaxExpense();
                    break;
                case 0:
                    System.out.println("До свидания!");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }

    private static void enterExpense(Scanner scanner) {
        System.out.print("Введите день (от 1 до 30): ");
        int day = scanner.nextInt() - 1;
        if (day < 0 || day >= DAYS) {
            System.out.println("Неверный день. Пожалуйста, введите снова.");
            return;
        }
        System.out.print("Введите сумму трат за текущий день: ");
        int expense = scanner.nextInt();
        if (expenses[day] != 0) {
            System.out.println("За этот день уже указана сумма. Перезаписать сумму? (да/нет)");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("да")) {
                return;
            }
        }
        expenses[day] = expense;
    }

    private static void printExpenses() {
        for (int i = 0; i < DAYS; i++) {
            System.out.printf("%d день – %d руб\n", i + 1, expenses[i]);
        }
    }

    private static void printMaxExpense() {
        int maxDay = 0;
        for (int i = 1; i < DAYS; i++) {
            if (expenses[i] > expenses[maxDay]) {
                maxDay = i;
            }
        }
        System.out.printf("%d день – %d руб\n", maxDay + 1, expenses[maxDay]);
    }
}
