package Middle.Refrigerator;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private int maxVolume;
    private int cirrentVolume;

    private List<Product> products;


    public Fridge(int maxVolume) {

        this.maxVolume = maxVolume;
        this.cirrentVolume = 0;
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        int availableSpace = maxVolume - cirrentVolume;

        if (cirrentVolume + product.getVolume() <= maxVolume) {
            products.add(product);
            cirrentVolume += product.getVolume();

        } else if (availableSpace > 0) {
            int addedVolume = availableSpace;
            Product partialProduct = product.split(addedVolume);
            products.add(partialProduct);
            cirrentVolume += addedVolume;
            System.out.println("Только часть продукта " + product.getName() + " " + product.getVolume() + " " + " добавленна в холодильник");
        } else {
            System.out.println("Объем холодильника переполнен " + product.getName() + " " + product.getVolume() + " не поместились в холодильник");

        }
    }


    public void listOfProduct() {
        if (products.isEmpty()) {
            System.out.println("Холодильник пуст");
        } else {
            System.out.println("Содержимое холодильника");
            for (Product product : products) {
                product.describe();
            }
        }
    }

    public int getTotalVolume() {
        int totalValume = 0;
        for (Product product : products) {
            totalValume += product.getVolume();
        }
        return totalValume;
    }

}
