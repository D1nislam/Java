package Java_Base;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(9) + 1;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите число от 1 до 9:");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Поздравляем, вы угадали число!");
                return;
            } else if (guess < secretNumber) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше.");
            }
        }

        System.out.println("К сожалению, вы не угадали число. Попробуйте снова!");
    }
}
