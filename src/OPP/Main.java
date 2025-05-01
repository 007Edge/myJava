package OPP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while(true) {

                line = r.readLine();
                boolean num = Boolean.parseBoolean(line);

                if (line.equals("exit")) break;

                System.out.println("Line:"+line);
                System.out.println("Num: "+num);

            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter number");
        } catch (IOException e) {
            System.out.println("File Exception");
        }


    }
}
