package OPP.FileHandling.PrintWriter;

import java.io.PrintWriter;

public class WritingConsole {
    public static void main(String[] args) {
        PrintWriter r = new PrintWriter(System.out,true);  // true is used for autoFlush
        r.println("Hi");
        r.print("my name is Shivam and there will be no nextline: ");
        r.print('g');
        r.flush();   // flush the output to console forcefully, useful when not using r.close
        r.close();   // if you'll write r.close(); you'll see any output on console until you use r.flush();
    }
}


// we are going to use PrintWriter to write on console we can also use it to write into files
