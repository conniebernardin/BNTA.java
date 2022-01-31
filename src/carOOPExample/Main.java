package carOOPExample;

public class Main {
    public static void main(String[] args) {

        Car honda = new Car("Honda", "BNTA 123", false);
        Car tesla = new Car("Tesla", "BNTA 1234", true);
        Car mini = new Car("Mini", "BNTA 12345", false);
        Car Mitsubishi = new Car("Mitsubishi", "BNTA 123456", false);
        Car Suzuki = new Car("Suzuki", "BNTA 321", true);

        Car[] connieCars = {honda, mini, tesla}; //naming car array and adding car into the array
        Car [] aidanCars = {Mitsubishi, Suzuki};

        Person connie = new Person(
                "Connie",
                22,
                "connie@gmail.com",
                connieCars);

        Person aidan = new Person(
                "Aidan",
                21,
                "Aidan@yahoo.co.uk",
                aidanCars);

        Garage conniesGarage = new Garage(
                connie,
                1,
                3);

        Garage aidanGarage = new Garage(
                aidan,
                2,
                6);


      //adding functionality with garageService class

        GarageService garageService = new GarageService();

        conniesGarage.setOpen(true);
        aidanGarage.setOpen(true);

        // add one car to Aidan
        garageService.addCar(
                aidanGarage,
                aidan.getCars()[0]);

        //add all cars to Connie
        for (Car connieCar : connie.getCars()){
            garageService.addCar(
                    conniesGarage,
                    connieCar
            );
        }

        //to remove one car from index 1 in Connie's Garage
        garageService.removeCar(
                conniesGarage,
                connie.getCars()[1]
        );

      //  System.out.println(conniesGarage);
        System.out.println("--------------------------------------");
        System.out.println("Cars in Connie's Garage:");
        for (Car c: conniesGarage.getCars()){
            System.out.println(c);
        }

        System.out.println("--------------------------------------");
        System.out.println("Total number of cars in Connie's Garage:");
        System.out.println(garageService.getTotalCarsInGarage(conniesGarage));


        System.out.println("--------------------------------------");
        System.out.println("Cars in Aidan's Garage:");
        for (Car a: aidanGarage.getCars()){
            System.out.println(a);
        }
        System.out.println("--------------------------------------");
        System.out.println("Total number of cars in Aidan's Garage:");
        System.out.println(garageService.getTotalCarsInGarage(aidanGarage));



    }
}
