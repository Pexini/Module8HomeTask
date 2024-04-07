package Hard.AutoCentr;

abstract class Cars {

    private String Brand;
    private int price;

    public Cars(String brand, int price) {
        Brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public int getPrice() {
        return price;
    }
    abstract String getType();

  }
