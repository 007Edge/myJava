package OPP.FileHandling.Buffered.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingConsole {
    public static void main(String[] args) {

        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                String line = r.readLine();  // note in the end of string r.readLine return null
                System.out.println(line);
                if (line.equals("exit")) {
                    break;
                }
            }

            r.close();
        }

        catch (IOException e) {
            System.out.println("Error !");
        }

    }
}
// we are reading data from console and printing it on console.
