package FileIOUebung;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {

    private List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public AddressManager() {
        addresses = new ArrayList<>();
    }

    public void add(Address a){
        addresses.add(a);
    }

    public void exportToCsv (String path, String separator) throws AddressExportException, IOException {

            FileWriter fileWriter = new FileWriter(new File(path));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Address a : getAddresses()){
                bufferedWriter.write(a.getFirstname() + separator + a.getLastname() + separator +
                        a.getMobileNumber() + separator + a.getMobileNumber());
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
            bufferedWriter.close();
    }

    public void loadFromCsv (String path, String separator) throws AddressLoadException{

        addresses.removeAll(addresses); // why clear the list and not just make a new one?

        try{
            FileReader fileReader = new FileReader(new File(path));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String temp;

                while ((temp = bufferedReader.readLine()) != null) {
                    String[] tempp = temp.split(separator);
                    if(tempp.length != 4)
                        throw new AddressLoadWrongFormatException("4 Spalten erwartet");

                    addresses.add(new Address(tempp[0], tempp[1], tempp[2], tempp[3]));
                }

            bufferedReader.close();
                } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AddressLoadWrongFormatException e) {
            e.printStackTrace();
        }
    }
}
