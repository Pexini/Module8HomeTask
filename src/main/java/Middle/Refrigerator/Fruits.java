package Middle.Refrigerator;

public class Fruits extends Product{
    public Fruits(String name, int volume) {
        super(name, volume);
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public int getVolume() {
        return super.getVolume();
    }


    @Override
    void describe() {
        System.out.println("Фрукты " + getName() + "\", объем " + getVolume());
    }
}
