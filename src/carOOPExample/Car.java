package carOOPExample;

import java.util.Objects;

public class Car {
    private String make;
    private String regNumber;
    private boolean isElectric;

    public Car(String make, String regNumber, boolean isElectric) {
        this.make = make;
        this.regNumber = regNumber;
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //if instances are the same then return true
        if (o == null || getClass() != o.getClass()) return false; //if instance is null or (||) isn't same class then there's non point continuing because its false
        Car car = (Car) o; // states that the object must equal the instance in question since it has passed checks above ^^^
        return isElectric == car.isElectric && Objects.equals(make, car.make) && Objects.equals(regNumber, car.regNumber); //checks that all fields are the same and returns true
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, regNumber, isElectric);
    }
}
