package ObjectOrientedProgramming.ClassesExercises.ExerciseOne;

import java.util.Arrays;

public class CarDealership {
    private String name;
    private int displaySpaces;
    private Car[] inStock;

    //constructor for dealership with cars inStock
    public CarDealership(String name, int onDisplay, Car[] inStock) {
        this.name = name;
        this.displaySpaces = onDisplay;
        this.inStock = new Car[0];
    }
    // constructor for new  dealership that doesn't have any cars yet
    public CarDealership(String name, int onDisplay) {
        this.name = name;
        this.displaySpaces = onDisplay;
        this.inStock = new Car[0];
    }

    //setting and getting

    public void setName (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDisplaySpaces(int displaySpaces){
        this.displaySpaces = displaySpaces;
    }
    public int getDisplaySpaces(){
        return displaySpaces;
    }

    public void setInStock(Car[] inStock) {
        this.inStock = inStock;
    }
    public Car[] getInStock(){
        return inStock;
    }

    //overriding methods

    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", displaySpaces=" + displaySpaces +
                ", inStock=" + Arrays.toString(inStock) +
                '}';
    }
}


