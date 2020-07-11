package FileUebungen.Product;

public class Product {
    String productName;
    double price;
    String productCategory;

    public Product(String productName, double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCategory() {
        return productCategory;
    }
}
