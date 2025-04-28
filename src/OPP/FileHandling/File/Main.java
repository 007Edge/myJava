package OPP.FileHandling.File;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("example.txt");      // in the parenthesis you can give full path.
            if (f.createNewFile()) {    // createNewFile() method creates new file if it is not present in the directory
                System.out.println("File created: " + f.getName());  // getName() method return the name of the file
            }

            else {
                System.out.println("File already exist");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
