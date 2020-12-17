
/*
Exercise 3: (2) Create two packages: debug and debugoff, containing an identical class with a debug( ) method.
The first version displays its String argument to the console, second does nothing.
Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.
 */
import static debug.D3.debug;
public class Runner {
    public static void main(String[] args) {
        debugoff.D3.setStr("addsfa");
        System.out.println(1);
        debugoff.D3.debug();
        System.out.println(2);
        debug.D3.setStr("asfa");
        debug();
    }
}
