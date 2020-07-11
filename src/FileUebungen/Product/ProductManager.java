package FileUebungen.Product;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void add(Product p){
        products.add(p);
    }

    public void saveToFile (String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Product p : products){
            bufferedWriter.write(p.getProductName() + "-" + p.getPrice() + "-" + p.getProductCategory());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void readFromFile(String path) throws IOException {
        File file = new File (path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while (( line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }
}
