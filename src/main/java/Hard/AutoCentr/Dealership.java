package Hard.AutoCentr;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    private List<Cars> cars = new ArrayList<>();

    public void addCar(Cars car) {
        cars.add(car);
    }

    public void sellCar(Cars car) {
        boolean carFound = false;
        for (Cars storedCar : cars) {
            if (storedCar.equals(car)) {
                cars.remove(storedCar);
                System.out.println("Автомобиль продан: " + storedCar.getBrand() + ", за - " + new DecimalFormat("#,###,###,##0.00").format(storedCar.getPrice()));
                carFound = true;
                break;
            }
        }
        if (!carFound) {
            System.out.println("Такого автомобиля нет в наличии");
        }
    }

    public void showAllCars() {
        System.out.println("Список всех автомобилей:");
        for (Cars car : cars) {
            System.out.println(car.getBrand() + " " + car.getType() + ", Цена: " + new DecimalFormat("#,###,###,##0.00").format(car.getPrice()));
        }
    }

    public void showMostExpensiveCar() {
        Cars mostExpensive = cars.stream().max(Comparator.comparing(Cars::getPrice)).orElse(null);
        if (mostExpensive != null) {
            System.out.println("Самый дорогой автомобиль : " + mostExpensive.getBrand() + " " + new DecimalFormat("#,###,###,##0.00").format(mostExpensive.getPrice()) + " " + mostExpensive.getType());
        }
    }

    public void showCheapestCar() {
        Cars cheaperCar = cars.stream().min(Comparator.comparing(Cars::getPrice)).orElse(null);
        if ((cheaperCar != null)) {
            System.out.println("Самый дешевый автомобиль: " + cheaperCar.getBrand() + " " + new DecimalFormat("#,###,###,##0.00").format(cheaperCar.getPrice()) + " " + cheaperCar.getType());
        }
    }
}

