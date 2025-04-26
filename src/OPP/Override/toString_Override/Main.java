package OPP.Override.toString_Override;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name;
    }
}

public class Main {
    
    public static void main(String[] args) {

        Person p1 = new Person("Shivam", 20);
        System.out.println(p1);

        // when we print p1 java automatically uses p1.toString()
        // we are overriding toString in our Person class
        // because java will first search toString() method in the current class i.e. Person
        // if not found it will go Object class
        // why public in front of toString()
        // toString() in Object class is defined like :  public String toString();
        // So, when you override it, you must use the same or a more accessible access modifier
        // which in this case is public. Otherwise, you'll get a compiler error.
    }

}
