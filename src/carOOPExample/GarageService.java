package carOOPExample;
//this is a business logic class

import java.security.PublicKey;

public class GarageService {
    //1. Add car
    //2. Check for cars currently in garage
    //3. remove car
    //4. Open and close garage
    //5. isGarageFull
    //7. filter electric cars
    //8. filter non-electric cars
    //9. clean garage

    public void addCar(Garage garage, Car car) {
        // check if open
            //if open check not full
                //add car garage
            //if full throw exception
        //if not open throw exception
        if (garage.isOpen()){

            int currentCarsInGarageCount = getTotalCarsInGarage(garage); //invoking method to count cars in garage

            if (currentCarsInGarageCount < garage.getCapacity()) {
                for  (int i =0; i < garage.getCars().length; i++){ //checking through each index
                    if (garage.getCars()[i] == null){ //finding space in array where index is null
                        garage.getCars()[i] = car; //add car into the null space in array
                        break; //don't need to continue looping once spot has been filled
                    }
                }
            } else {
                throw new IllegalStateException(garage.getGarageNumber() + "is full!");
            }
        } else {
            throw new IllegalStateException(garage.getGarageNumber() + "is closed. Please open before adding your car");
        }

    }

    public int getTotalCarsInGarage(Garage garage) {
        int currentCarsInGarageCount = 0; //looping through array of cars
        for (Car c : garage.getCars()) {
            if (c != null){ //null means there is no car at that index in the car array
                currentCarsInGarageCount++;  //for every null, count empty spaces.
            }
        }
        return currentCarsInGarageCount;
    }
}
