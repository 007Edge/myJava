package OPP.FileHandling.FileWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        String path = "text.txt";
        String content = """
                hello my name is Edge
                and I love to play FarCry 3
                """;

        try(FileWriter w = new FileWriter(path)) {
            w.write(content);
            System.out.println("File written Successfully");
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        catch (IOException e) {
            System.out.println("Any other error");
        }




    }

}
