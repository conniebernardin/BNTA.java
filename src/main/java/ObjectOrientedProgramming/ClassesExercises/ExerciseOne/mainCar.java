package ObjectOrientedProgramming.ClassesExercises.ExerciseOne;

public class mainCar {
    public static void main(String[] args) {
        Car honda = new Car(2008, Manufacturer.HONDA, 80_000, "Petrol", 1000);
        Car daihatsu = new Car(2018, Manufacturer.DAIHATSU, 0, "Electric", 20_000);
        Car mazda = new Car(2020, Manufacturer.MAZDA, 200, "Diesel", 300_000);
        Car toyota = new Car(2012, Manufacturer.TOYOTA, 20_000, "Petrol", 9_000);


        CarDealership dealershipOne = new CarDealership("Connie's cars", 22);
        dealershipOne.setInStock(new Car[]{honda, daihatsu, mazda, toyota});

        //invoking method from CarCounter class
        carService counter = new carService();
        int carsInStock = counter.carCount(dealershipOne);
        System.out.println(carsInStock);
    }

}

