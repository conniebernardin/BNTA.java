package ObjectOrientedProgramming.ClassesExercises.ExerciseOne;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return displaySpaces == that.displaySpaces && Objects.equals(name, that.name) && Arrays.equals(inStock, that.inStock);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, displaySpaces);
        result = 31 * result + Arrays.hashCode(inStock);
        return result;
    }
}


