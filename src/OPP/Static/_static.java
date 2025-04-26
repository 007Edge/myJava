package OPP.Static;

public class _static {
    public static void main(String[] args) {
        Human shivam = new Human("shivam",10000,20);
        Human radhe = new Human("Radhe", 20000, 52);
        Human Pratik = new Human("Pratiksha", 15000,23);

        System.out.println(shivam.name);
        System.out.println(radhe.name);
        System.out.println(Pratik.name);

        System.out.println(Human.population);
        // System.out.println(shivam.population);  note by convenstion it should be written as Human.population

        // #note: you can only access static method is form static method
        // static method dont need object to run
        // or to access it you need to create a object that is refer to that non static method
        fun();

    }

    static void fun() {
        _static obj = new _static();   // creating a object obj for accessing fun2
        obj.fun2();                    // fun2 is a non static function

    }
    void fun2() {
        System.out.println("fun2 is working");
    }
}

class Human {
    String name;
    int salary;
    int age;
    static int population;

    Human(String name, int salary, int age) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population+=1;  // this.population will also work;

        // #note you can't use this.--- inside a static method
    }

}
