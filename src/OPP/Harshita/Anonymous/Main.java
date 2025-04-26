package OPP.Harshita.Anonymous;


interface Harshi {
    void printInfo();
}


public class Main {
    public static void main(String[] args) {
        Harshi obj = new Harshi(){
            public void printInfo() {
                System.out.println("Harshita");
            }
        };

        obj.printInfo();
    }
}
