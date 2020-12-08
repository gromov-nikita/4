/*
Exercise 6: (1) Create a class with protected data. Create a second class in the same file
with a method that manipulates the protected data in the first class.
 */

public class D6 {
    protected int a;
    protected void printA(){
        System.out.println(a);
    }
}
class D {
    public static void main(String[] args) {
        D6 q = new D6();
        System.out.println(q.a);
        q.a = 4;
        q.printA();
    }
}