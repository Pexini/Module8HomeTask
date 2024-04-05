package Middle.Refrigerator;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge(100);

        fridge.addProduct(new Fish("Рыба", 20));
        fridge.addProduct(new Bread("Хлеб", 20));
        fridge.addProduct(new Cheese("Сыр", 30));
        fridge.addProduct(new Meat("Мясо", 20));
        fridge.addProduct(new Fruits("Фрукты", 40));
        fridge.listOfProduct();




        int getTotalVolume = fridge.getTotalVolume();
                System.out.println("Холодильник заполнен на " + getTotalVolume);

    }
}
