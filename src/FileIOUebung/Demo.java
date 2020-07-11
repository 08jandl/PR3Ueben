package FileIOUebung;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        AddressManager addressManager = new AddressManager();

        Address a = new Address("Silke", "Janld", "09845390458", "sdfja@.gkjvod");

        addressManager.add(a);
        addressManager.add(new Address("ysdf", "dgag", "ydfgseg", "ysdgjsf"));

        try {
            addressManager.exportToCsv("addresses2.txt", " - ");
            addressManager.loadFromCsv("addresses2.txt", " - ");
        } catch (AddressExportException | IOException | AddressLoadException e) {
            e.printStackTrace();
        }
    }
}
