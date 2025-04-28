package OPP.FileHandling.Buffered;

import java.io.PrintWriter;

public class OutConsole {
    public static void main(String[] args) {
        PrintWriter r = new PrintWriter(System.out);
        r.println("Hi");
        r.print("my name is Shivam and there will be no nextline: ");
        r.print('g');
        r.flush();   // flush the output to console forcefully, useful when not using r.close
        r.close();   // if you'll write r.close(); you'll see any output on console until you use r.flush();
    }
}


// we are going to use PrintWriter to write on console we can also use it to write into files
