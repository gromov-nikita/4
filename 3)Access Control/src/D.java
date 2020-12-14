
/*
Exercise 3: (2) Create two packages: debug and debugoff, containing an identical class with a debug( ) method.
The first version displays its String argument to the console, second does nothing.
Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.
 */
import static debug.D3.debug;
import static debugoff.D3.setStr;

public class D {
    public static void main(String[] args) {
        setStr("addsfa");
        debugoff.D3.debug();
        debug.D3.setStr("asfa");
        debug.D3.debug();
    }
}
