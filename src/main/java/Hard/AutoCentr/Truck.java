package Hard.AutoCentr;

public class Truck extends Cars{
    public Truck(String brand, int price) {
        super(brand, price);
    }

    @Override
    String getType() {
        return "Грузовик";
    }
}
