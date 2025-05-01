package OPP.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithBlock {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println("Exception caught");
        }
    }
}

// this is just notes, at this time while I am studying this topic I am not aware about file handling

// try-with-resources
// the object that is being created in 'try(---)'  parenthesis will be closed automatically if the class of the object is implementing the AutoCloseable interface
// no need of finally block to close the file