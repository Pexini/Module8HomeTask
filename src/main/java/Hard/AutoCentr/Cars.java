package Hard.AutoCentr;

import java.util.Objects;

public abstract class Cars {

    protected String Brand;
    protected double price;

    public Cars(String brand, double price) {
        Brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public double getPrice() {
        return price;
    }
    abstract String getType();

    abstract public boolean equals(Object o);

  }
