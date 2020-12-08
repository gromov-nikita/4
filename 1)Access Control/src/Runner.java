
/*
Exercise 1: (1) Create a class in a package. Create an instance of your class outside of that
package.
 */

import OutPackage.Outside;
public class Runner {
    public static void main(String[] args) {
        Outside q = new Outside();
        q.setN(1);
        System.out.println(q.getN());
    }
}

