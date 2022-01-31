package carOOPExample;

public class Main {
    public static void main(String[] args) {

        Car honda = new Car("Honda", "BNTA 123", false);
        Car tesla = new Car("Tesla", "BNTA 1234", true);
        Car mini = new Car("Mini", "BNTA 12345", false);

        Car[] connieCars = {honda, mini, tesla}; //naming car array and adding car into the array

        Person connie = new Person(
                "Connie",
                22,
                "connie@gmail.com",
                connieCars);

        Garage conniesGarage = new Garage(
                connie,
                1,
                3);

        GarageService garageService = new GarageService();

        conniesGarage.setOpen(true);

//       to add one car
//        garageService.addCar(
//                conniesGarage,
//                connie.getCars()[0]);

        //add all cars
        for (Car connieCar : connie.getCars()){
            garageService.addCar(
                    conniesGarage,
                    connieCar
            );
        }

      //  System.out.println(conniesGarage);
        System.out.println("--------------------------------------");
        System.out.println("Cars in Connie's Garage:");
        for (Car c: conniesGarage.getCars()){
            System.out.println(c);
        }

        System.out.println("--------------------------------------");
        System.out.println("Total number of cars:");
        System.out.println(garageService.getTotalCarsInGarage(conniesGarage));

    }
}
