package OPP.FileHandling.Buffered.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader(("example.txt")));
            String line;
            while ((line = r.readLine()) != null) {  // r.readLine() reads file line by line when it reach it end of the file it returns null and loop breaks
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// reading from a file line by line using BufferedReader or writing data to console
