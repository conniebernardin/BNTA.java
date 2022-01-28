package ObjectOrientedProgramming.ClassesExercises.ExerciseOne;

public class mainCar {
    public static void main(String[] args) {
    Car newCar = new Car(2008, Manufacturer.HONDA, 80_000, "Petrol", 1000);
        System.out.println(newCar.toString());
        System.out.println(newCar.getEngineType());
    }
}
