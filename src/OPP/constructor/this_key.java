package OPP.constructor;

public class this_key {
    public static void main(String[] args) {

        Student[] s = new Student[2];
        s[0] = new Student("Shivam", 58);
        s[1] = new Student("Ayush", 59);

        s[0].getDetails();
        s[1].getDetails();



    }
}

class Student {
    String name;
    int roll;

    Student(int n) {

        System.out.println("This constructor is called with value: "+n);
    }

    Student(String name, int roll) {
        this(59);
        this.name = name;
        this.roll = roll;
    }

    void getDetails() {

        System.out.println("Name: "+this.name+"\nRoll: "+this.roll);
    }
}