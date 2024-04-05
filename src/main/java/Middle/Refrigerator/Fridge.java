package Middle.Refrigerator;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private int maxVolume;
    private int currentVolume;

    private List<Product> products;


    public Fridge(int maxVolume) {

        this.maxVolume = maxVolume;
        this.currentVolume = 0;
        this.products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        int availableSpace = maxVolume - currentVolume;

        if (currentVolume + product.getVolume() <= maxVolume) {
            products.add(product);
            currentVolume += product.getVolume();

        } else if (availableSpace > 0) {
            int addedVolume = availableSpace;
           Product partialProduct = product.split(addedVolume);
            products.add(partialProduct);
            currentVolume += addedVolume;
            System.out.println("Только часть продукта " + product.getName() + " добавлено в холодильник " + " " + product.getVolume() + " - не поместилось в холодильник");
        } else {
            System.out.println("Объем холодильника переполнен ");
            System.out.println(product.getName() + " " + product.getVolume() + " не поместились в холодильник");

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
