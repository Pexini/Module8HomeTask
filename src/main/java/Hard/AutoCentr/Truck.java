package Hard.AutoCentr;

import java.util.Objects;

public class Truck extends Cars {
    public Truck(String brand, double price) {
        super(brand, price);
    }

    @Override
    String getType() {
        return "Грузовик";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.price, price) == 0 &&
                Objects.equals(Brand, truck.Brand);
    }
}

