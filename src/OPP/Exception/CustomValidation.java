package OPP.Exception;

public class CustomValidation {
    public static void main(String[] args) {
        try {
            validateAge(15);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        validateAge(15);
    }

    public static void validateAge(int age) throws IllegalArgumentException{  // method signature
        if (age < 18) {
            throw new IllegalArgumentException("Invalidate Age");
            // force fully creating an object of IllegalArgumentException
            // and throwing exception to the class which is calling validate method
        }
    }
}
