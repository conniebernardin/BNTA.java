package ObjectOrientedProgramming.ClassesExercises.ExerciseOne;

public class mainCar {
    public static void main(String[] args) {
        Car newCar = new Car(2008, Manufacturer.HONDA, 80_000, "Petrol", 1000);
        System.out.println(newCar.getEngineType());
        Car daihatsu = new Car(2018, Manufacturer.DAIHATSU, 0, "Electric", 20_000);

        CarDealership dealership = new CarDealership("Connie's cars", 22);
        dealership.setInStock(new Car[]{newCar, daihatsu});
    }
}
