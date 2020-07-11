package FileUebungen;

import java.io.File;

public class ListDataInfo {
    public static void main(String[] args) {

        listDataInfo(new File("C:\\Users\\User\\Desktop\\Campus02"));
    }
    public static void listDataInfo (File directory){
        if(directory.isDirectory()){
            long fileLengths = 0;
            for (File f : directory.listFiles()){
                System.out.println("List Files: " + f.getName() + " --- " + "Length in Bytes: " + f.length());
                fileLengths += f.length();
            }
            System.out.println("All files together have a length of: " + fileLengths);
        }
        else {
            System.out.println("File does not exist or is not a directory");
        }
    }
}
