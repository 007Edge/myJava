package OPP.NestedClass.Anonymous;

interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting obj = new Greeting() {
            @Override
            public void sayHello() {

                System.out.println("hi");
            }
        };

        obj.sayHello();
    }
}

    // you can also extend class and abstract class
    // can only implement or extend one (interface/class/abstract class) at a time
    // can not define constructor



/*   behind the scenes
   class Main$1 implements Animal {
        public void sound() {
            System.out.println("Bark!");
        }
    }
*/
