package Hard.AutoCentr;

import java.util.Objects;

public class Sedan extends Cars{
    public Sedan(String brand, double price) {
        super(brand, price);
    }

    @Override
    String getType() {
        return "Седан";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedan sedan = (Sedan) o;
        return Double.compare(sedan.price, price) == 0 &&
                Objects.equals(Brand, sedan.Brand);
    }
}
