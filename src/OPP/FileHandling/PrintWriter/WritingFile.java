package OPP.FileHandling.PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class WritingFile {
    public static void main(String[] args) {
        try {
            PrintWriter r = new PrintWriter(new File("text.txt"));  // java implicitly write new File("text.txt");
            r.println("Writing into file using PrintWriter");
            r.print("no new line will be added: ");
            r.printf("Printing numbers %.2f\n", 34.43);
            r.close();
        }
        catch (IOException e) {
            System.out.println("IOException");
        }


    }
}


// we are going to use PrintWriter to write into files
// note it will overwrite the files



