package OPP.Exception;


class UnderAgeException extends Exception{
    public UnderAgeException(String s) {
        super(s);   // will call the Exception constructor -> Throwable constructor and message will be stored
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            validateAge(15);
        }
        catch (UnderAgeException e) {
            System.out.println(e.getMessage());
            // now when we use e.getMessage() the message we just sent using super(s); is retrieved
            // e is the object of our Custom exception class i.e. UnderAgeException
            // and getMessage() is method that is defined in Throwable class
        }
    }

    public static void validateAge(int age) throws UnderAgeException {  // adding method signature
        // this will throw the responsibility of handling the exception to the method which have called validateAge(int age) method i.e. main
        if (age < 18) {
            throw new UnderAgeException("Invalid Age");
            // explicitly creating an object on UnderAgeException
            // and throwing it
        }
        System.out.println("Age is "+ age);
    }
}
