package Hard.AutoCentr;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        dealership.addCar(new Sedan("Volkswagen Polo", 350_000));
        dealership.addCar(new Sedan("Volkswagen Golf", 250_000));
        dealership.addCar(new Sedan("Volkswagen Alltrack", 750_000));
        dealership.addCar(new Sedan("Volkswagen Variant", 650_000));
        dealership.addCar(new Sedan("BMW M3", 450_000));
        dealership.addCar(new Sedan("BMW X5", 1_550_000));
        dealership.addCar(new Sedan("Skoda RAPID", 650_000));
        dealership.addCar(new Sedan("Skoda OCTAVIA", 550_000));
        dealership.addCar(new Sedan("Volvo S60", 750_000));
        dealership.addCar(new Sedan("Volvo S90", 1_300_000));

        dealership.addCar(new Truck("Freightliner Argosy", 5_300_000));
        dealership.addCar(new Truck("Freightliner Century", 4_500_000));
        dealership.addCar(new Truck("Freightliner Classic", 3_700_000));
        dealership.addCar(new Truck("International 7600", 5_300_000));
        dealership.addCar(new Truck("International LoneStar", 9_300_000));
        dealership.addCar(new Truck("International ProStar", 8_000_000));


        dealership.addCar(new Bus("ЛиАЗ 4292", 8_000_000));
        dealership.addCar(new Bus("ГАЗ Газель Некст Ситилайн", 3_250_000));
        dealership.addCar(new Bus("Setra S411", 9_000_000));
        dealership.addCar(new Bus("Iveco 315", 10_150_000));


        dealership.sellCar(new Bus("Iveco 315", 10_150_000));
        dealership.sellCar(new Sedan("Volvo S90", 1_300_000));

        dealership.showAllCars();
        dealership.showCheapestCar();
        dealership.showMostExpensiveCar();

    }

}
