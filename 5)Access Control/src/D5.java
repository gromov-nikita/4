/*
Exercise 5: (2) Create a class with public, private, protected, and package-access
fields and method members. Create an object of this class and see what kind of compiler
messages you get when you try to access all the class members. Be aware that classes in the
same directory are part of the “default” package.
 */
public class D5 {
    private int a1;
    protected int a2;
    int a3;
    public int a4;
    private void printA1(){
        System.out.println("a1");
    }
    protected void printA2(){
        System.out.println("a2");
    }
     void printA3(){
        System.out.println("a3");
    }
    public void printA4() {
        System.out.println("a4");
    }

    public static void main(String[] args) {
        D5 q = new D5();
        q.a1 = 4;
        q.a2 = 3;
        q.a3 = 2;
        q.a4 = 1;
        q.printA1();
        q.printA2();
        q.printA3();
        q.printA4();

    }
}
