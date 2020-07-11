package FileUebungen;

import java.io.*;

public class BinaryIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String s = "Hello World";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.dat"));

        objectOutputStream.writeObject(s);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.dat"));

        Object name = objectInputStream.readObject();
        System.out.println((String)name);
    }
}
