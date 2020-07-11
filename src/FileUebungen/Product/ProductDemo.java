package FileUebungen.Product;

import java.io.IOException;

public class ProductDemo {
    public static void main(String[] args) throws IOException {
        Product product = new Product("thing", 12.22, "thingywhingy");
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(new Product("another thing", 132.3, "thaaang"));

        productManager.saveToFile("products.txt");
        productManager.readFromFile("products.txt");

    }
}
