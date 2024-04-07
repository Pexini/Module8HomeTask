package Hard.AutoCentr;

public class Bus extends Cars{
    public Bus(String brand, int price) {
        super(brand, price);
    }

    @Override
    String getType() {
        return "Автобус";
    }
}
