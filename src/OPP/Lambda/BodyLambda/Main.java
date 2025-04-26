package OPP.Lambda.BodyLambda;

interface Calculate {
    int sum(int num1, int num2);
}

public class Main {
    public static void main(String[] args) {
        Calculate obj = (a, b) -> {
            System.out.println("This is another way to define body of lambda expression");
            return a+b;
        };

        System.out.println(obj.sum(6,4));
    }
}
