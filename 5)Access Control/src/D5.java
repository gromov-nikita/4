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
        q.setA1(4);
        q.setA2(3);
        q.setA3(2);
        System.out.println(q.getA1());
        System.out.println(q.getA2());
        System.out.println(q.getA3());

    }
}
