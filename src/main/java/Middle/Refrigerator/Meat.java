package Middle.Refrigerator;

public class Meat extends Product{
    public Meat(String name, int volume) {
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
        System.out.println("Мясо " + getName() + "\", объем " + getVolume());
    }
}
