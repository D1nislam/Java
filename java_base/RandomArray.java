package Java_Base;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args){
        int[] array = new int[10];
        Random rnd = new Random();

        for (int i=0; i < array.length; i++) {
            array[i] = rnd.nextInt(51);
            System.out.println(array[i] + " ");
        }


        // min
        int min = array[0];
        for (int i = 0; i < array.length; i++ ) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Min: " + min);

        // max
        int max = array[0];
        for (int i = 0; i < array.length; i++ ) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max: " + max);

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i]/array.length;
        }
        System.out.println("Average in: " + average);
    }
}
