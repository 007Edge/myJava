package OPP.Exception;

import java.util.Scanner;

public class Try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = sc.nextInt();


        int div = -1;
        try {
            div = a/b;   // this statement can cause error that is why it is written in this block.
        }
        catch (ArithmeticException e) {    // try block throws an object of the error class(i.e. ArithmeticException in our case) which is in e variable
            System.out.println("some error occurred");
            return;
        }
        finally {    // this block always execute, even if return statement is written above it
            System.out.println(div);
        }


    }
}
