package Hard.AutoCentr;

public class Sedan extends Cars{
    public Sedan(String brand, int price) {
        super(brand, price);
    }

    @Override
    String getType() {
        return "Седан";
    }
}
