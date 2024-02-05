package Java_Base;

public class Courier {
    public static void main(String[] args) {
        int totalFloors = 10;
        int flatsPerFloor = 5;

        for (int floor = 1; floor <= totalFloors; floor++) {
            for (int flat = 1; flat <= flatsPerFloor; flat++) {
                System.out.println("Этаж " + floor + ", квартира " + flat + ". Посылка доставлена!");
            }
        }
    }
}
