package OPP.FileHandling.Buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputConsole {
    public static void main(String[] args) {

        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String text = r.readLine();
            System.out.println("String: "+text);
            // note if you want to convert string into number you should only enter number in console otherwise it will throw NumberFormatException
            int num = Integer.parseInt(text);
            System.out.println("NUM: "+ text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter only numbers");
        }
    }
}
