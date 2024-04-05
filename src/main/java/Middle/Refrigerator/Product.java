package Middle.Refrigerator;

abstract class Product {
    private String name;

    private int volume;

    protected abstract Product createProduct(String name, int volume);

    public Product(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }


    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    abstract void describe();


    public abstract Product split(int volume);

}
