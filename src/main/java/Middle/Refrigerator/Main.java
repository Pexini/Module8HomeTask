package Middle.Refrigerator;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge(100);

        fridge.addProduct(new Fish("Рыба", 25));
        fridge.addProduct(new Bread("Хлеб", 20));
        fridge.addProduct(new Cheese("Сыр", 15));
        fridge.addProduct(new Meat("Мясо", 25));
        fridge.addProduct(new Fruits("Фрукты", 20));

        fridge.listOfProduct();
        int getTotalVolume = fridge.getTotalVolume();
        System.out.println("Холодильник заполнен на " + getTotalVolume);


        fridge.listOfProduct();
        int getTotalVolume1 = fridge.getTotalVolume();
        System.out.println("Холодильник заполнен на " + getTotalVolume1);
    }
}
