package Middle.Refrigerator;

public class Fish extends Product{
    public Fish(String name, int volume) {
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
        System.out.println("Рыба " + getName() + "\", объем " + getVolume());
    }

    @Override
    protected Product createProduct(String name, int volume) {
        return null;
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(volume);
    }

    @Override
    public Product split(int volume) {
        return null;
    }
}
