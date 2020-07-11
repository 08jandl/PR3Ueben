package CreateNewFiles;

import java.io.File;
import java.io.IOException;

public class CreateNewFileAndCatch {
    public static void main(String[] args) {

        File file = new File("uebungsfile.txt");

        try{
            if(file.createNewFile()){
                System.out.println(file.getAbsoluteFile() +" filename for" + file.getName());
                System.out.println("File " + file.getName() +" has been created.");
            }
            else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
