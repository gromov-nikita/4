
/*
Exercise 1: (1) Create a class in a package. Create an instance of your class outside of that
package.
 */
import src2.D;
public class D1 {
    public static void main(String[] args) {
        D q = new D();
        q.setN(1);
        System.out.println(q.getN());
    }
}
