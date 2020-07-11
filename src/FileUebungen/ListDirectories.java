package FileUebungen;

import java.io.File;
import java.util.Arrays;

public class ListDirectories {
    public static void main(String[] args) {

        //listDirectories("C:\\Users\\User\\Desktop\\NAL");

        listDir(new File("C:\\Users\\User\\Desktop\\NAL"));
    }
/*    public static void listDirectories (String path){
        File file = new File(path);

        if(file.isFile() || file.isDirectory()){
            System.out.println("File " + file.getName() + " is a file & a directory");
            System.out.println(Arrays.toString(file.listFiles()));
        }
        else {
            System.out.println("File s either not a file or not a directory");
        }
    }*/

    public static void listDir (File file){

        if (file.exists() && file.isDirectory()){
            String[] filenames = file.list();
            for (String filename : filenames){
                System.out.println(filename);
            }
        }
        else{
            System.out.println("File does not exist or is not a directory");
        }
    }
}
