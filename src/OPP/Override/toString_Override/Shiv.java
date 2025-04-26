package OPP.Override.toString_Override;


class Human {
    String name;
    int age;

    Human (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return this.name + " " + this.age;
    }



}


public class Shiv {
    public static void main(String[] args) {
        Human s = new Human("Shivam", 20);
        System.out.println(s.toString());

        System.out.println(s instanceof Human);    // instanceof op

    }
}
