package FileUebungen;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        //File file = new File("C:\\Users\\User\\Desktop\\Campus02");

        File file = new File("IdRatherReadNow");


        if (!file.isFile() && !file.isDirectory()){
            System.out.println("Directory " +file.getAbsolutePath() + " created: " + file.mkdirs());
        }
        else {
            System.out.println("created: " + file.mkdirs() + " because file already exists here" + file.getAbsolutePath() + " directory could not be created");
        }

    }

}
