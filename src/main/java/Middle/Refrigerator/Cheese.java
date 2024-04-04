package Middle.Refrigerator;

public class Cheese extends Product{
    public Cheese(String name, int volume) {
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
        System.out.println("Сыр " + getName() + "\", объем " + getVolume());
    }
}
