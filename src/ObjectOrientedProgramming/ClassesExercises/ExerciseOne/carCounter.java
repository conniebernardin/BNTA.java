package ObjectOrientedProgramming.ClassesExercises.ExerciseOne;

public class carCounter {
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
}
