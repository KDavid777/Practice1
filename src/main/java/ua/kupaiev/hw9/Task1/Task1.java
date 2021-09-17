package ua.kupaiev.hw9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Saturn saturn = new Saturn();
        Earth earth = new Earth();
        Jupiter jupiter = new Jupiter();
        Mars mars = new Mars();


        System.out.println("Acceleration of gravity Earth: " + earth.getAccelerationOfGravity());
        System.out.print("The weight of the planet earth: ");
        earth.weight();
        System.out.println("Water on the planet: "+ earth.water);
        System.out.println("Acceleration of gravity Saturn: " + saturn.getAccelerationOfGravity());
        System.out.print("The weight of the planet Saturn: ");
        saturn.weight();
        System.out.println("Water on the planet: "+ saturn.water);
        System.out.println("Acceleration of gravity Jupiter: " + jupiter.getAccelerationOfGravity());
        jupiter.averageTemperature();
        System.out.println("Water on the planet: "+ jupiter.water);
        System.out.println("Acceleration of gravity Mars: " + mars.getAccelerationOfGravity());
        System.out.println("The age of the planet mars: ");
        mars.age();
        System.out.println("Oxygen on the planet: "+ mars.oxygen);
    }
}

