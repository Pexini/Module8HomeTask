package Middle.Refrigerator;

public class Bread extends Product{
    public Bread(String name, int volume) {
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
        System.out.println("Хлеб " + getName() + "\", объем " + getVolume()) ;
    }
}
