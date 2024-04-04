package Middle.Refrigerator;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge(100);
        Product bread = new Bread("Колбаса", 5);
        Product fish = new Fish("Рыба", 10);
        Product cheese = new Cheese("Сыр", 10);
        Product meat = new Meat("Мясо", 25);
        Product fruits = new  Fruits("фрукты", 15);

        fridge.addProduct(new Fish("Семга", 5));

        fridge.listOfProduct();
    }
}
