package CreateNewFiles;

import java.io.File;

public class VonFileAuslesen {
    public static void main(String[] args) {

                /*
        Uebung:

        Eine Methode, mit file als Parameter.

        Folgende Attribute für das angegebene File auslesen:
        - does it exist?
        - filename
        -parent directory of the file
        - path to the file
        - is it a directory?
        - is it a file?
        - is this file readable?
        - is this file writable?
         */

        File uebungsF = new File ("uebungsf.txt");
        fileInfo(uebungsF);



    }
    public static void fileInfo (File file){
        System.out.println("File exists: " + file.exists());
        System.out.println("Filename: " + file.getName());
        System.out.println("Parent directory: " + file.getParent());
        System.out.println("Path to File: " + file.getAbsolutePath());
        System.out.println("Is a directpry: " + file.isDirectory());
        System.out.println("Is a file: " + file.isFile());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
    }
}
