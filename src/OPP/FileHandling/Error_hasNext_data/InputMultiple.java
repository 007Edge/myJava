package OPP.FileHandling.Error_hasNext_data;

import java.util.Scanner;

public class InputMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if ("exit".equalsIgnoreCase(str)) break;
            System.out.println(str);
        }
    }
}
