package Middle.Refrigerator;

public class Bread extends Product {
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
    public void setVolume(int volume) {
        super.setVolume(volume);
    }

    @Override
    void describe() {
        System.out.println("Хлеб " + getName() + "\", объем " + getVolume());
    }

    @Override
    public Product split(int volume) {
        if (volume <= 0 || volume >= getVolume()) {
            return null;
        }
        setVolume(getVolume() - volume);
        return new Bread(getName() + " поместилось  в ", volume);
    }

}

