package Hard.AutoCentr;

import java.util.Objects;

public class Bus extends Cars {
    public Bus(String brand, double price) {
        super(brand, price);
    }

    @Override
    String getType() {
        return "Автобус";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.price, price) == 0 &&
                Objects.equals(Brand, bus.Brand);
    }
}
