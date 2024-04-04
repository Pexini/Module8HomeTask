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
        System.out.println("Фрукты " + getName() + "\", объем " + getVolume());
    }
}
