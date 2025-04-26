package OPP.Lambda.ParameterLamdbda;

@FunctionalInterface
interface A {
    String printName(String name);
}

public class Main {
    public static void main(String[] args) {
        A obj = (name) -> name;      // parameterize lambada
        String s = obj.printName("Shivam");
        System.out.println(s);
    }
}


// (name) is the formal parameter and -> name is implicitly written as 'return name'
// (name) -> name;       -> name;  is the body of lambda function.
// and (name) is implementing printName(String name); by the no. of parameter i.e. one in our case of string type
