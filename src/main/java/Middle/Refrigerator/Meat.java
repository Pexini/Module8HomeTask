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
    public void setName(String name) {
        super.setName(name);
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
        System.out.println("Мясо " + getName() + "\", объем " + getVolume());
    }
}
