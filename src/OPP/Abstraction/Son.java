package OPP.Abstraction;

public class Son extends Parent {
    public Son() {
        name = "TBD";
        age = -1;

    }
    @Override
    void career() {

        System.out.println("I want to be a software engineer");
    }

    @Override
    void partner() {

        System.out.println("Her name is "+name+" She's "+age);
    }
}
