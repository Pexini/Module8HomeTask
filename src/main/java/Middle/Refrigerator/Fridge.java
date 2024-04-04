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
        if (cirrentVolume + product.getVolume() <= maxVolume) {
            products.add(product);
            cirrentVolume += product.getVolume();
            System.out.println("Продукт " + product.getName() + " " + "добавлен в холодильник");
        } else {
            System.out.println("Объем холодильника не может вместить больше продуктов");
        }
    }

    public void removeProduct(Product productToRemove) {
        boolean found = false;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productToRemove.getName())) {
                found = true;
                products.remove(product);
                System.out.println("Продукт удален из холодильника " + product.getName());
                break;
            }
        }
        if (!found) {
            System.out.println("Данного продукта нет в холодильнике");
        }
    }
public void listOfProduct(){
        if (products.isEmpty()){
            System.out.println("Холодильник пуст");
        }else {
            System.out.println("Содержимое холодильника");
        for (Product product: products){
            product.describe();
        }
        }
}

}
