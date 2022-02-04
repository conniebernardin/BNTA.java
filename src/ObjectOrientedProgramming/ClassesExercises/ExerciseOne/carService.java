package ObjectOrientedProgramming.ClassesExercises.ExerciseOne;

public class carService {
    //method to count cars in CarDealership. Takes no parameters, returns an int.
    public int carCount(CarDealership carDealership){
        int carsCounted = 0;
        for (Car c : carDealership.getInStock()) {
            if (c != null){
                carsCounted ++;
            }
        }
        return carsCounted;
    }

    public int addCar(CarDealership carDealership, Car car){

        for (int i = 0; i < carDealership.getInStock().length; i++) { //loop through array InStock from carDealership class
            if (carDealership.getInStock()[i] == null) { //if index i is equal to null, there is a space. You can then add car.
                carDealership.getInStock()[i] = car; // car added to index point i
                break;

            }
        }
}
