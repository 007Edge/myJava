package OPP.FileHandling.Error_hasNext_data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {   // return true if input is an integer.
            int num = sc.nextInt();
            System.out.println(num);
        }
        else {
            System.out.println("Please enter a number");
        }

        /*
        Method              result

        hasNext()	        Returns true if there is another token
        hasNextLine()	    Checks if another line is available
        hasNextInt()	    Checks if the next token is an integer
        hasNextDouble()	    Checks for a double, and so on

        */



    }

}
