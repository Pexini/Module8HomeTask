package Hard.AutoCentr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    private List<Cars> cars = new ArrayList<>();

    public void addCar(Cars car) {
        cars.add(car);
    }

    public void sellCar(Cars car) {
        if (cars.contains(car)) {
            cars.remove(car);
            System.out.println("Автомобиль продан: " + car.getBrand() + " " + car.getPrice());
        } else {
            System.out.println("Такого автомобиля нет в наличии");
        }
    }

    public void showAllCars() {
        System.out.println("Список всех автомобилей:");
        for (Cars car : cars) {
            System.out.println(car.getBrand() + car.getType() + ", Цена: " + car.getPrice());
        }
    }

    public void showMostExpensiveCar() {
        Cars mostExpensive = cars.stream().max(Comparator.comparing(Cars::getPrice)).orElse(null);
            if (mostExpensive != null){
                System.out.println("Самый дорогой автомобиль : " + mostExpensive.getBrand() + " " + mostExpensive.getPrice() + " " + mostExpensive.getType());
            }
        }
        public void showCheapestCar(){
        Cars cheaperCar = cars.stream().min(Comparator.comparing(Cars::getPrice)).orElse(null);
        if ((cheaperCar != null)){
            System.out.println("Самый дешевый автомобиль: " + cheaperCar.getBrand() + " " + cheaperCar.getPrice() + " " + cheaperCar.getType());
        }
    }
}

