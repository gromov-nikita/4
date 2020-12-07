/*
Exercise 5: (2) Create a class with public, private, protected, and package-access
fields and method members. Create an object of this class and see what kind of compiler
messages you get when you try to access all the class members. Be aware that classes in the
same directory are part of the “default” package.
 */
import src2.D;
public class D5 {
    public static void main(String[] args) {
        D q = new D();
        //q.a1 = 4;
        //q.a2 = 3;
        //q.a3 = 2;
        q.a4 = 1;
        //q.printA1();
        //q.printA2();
        //q.printA3();
        q.printA4();

    }
}
