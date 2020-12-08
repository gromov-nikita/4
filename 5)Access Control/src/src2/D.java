package src2;
public class D {
    private int a1;
    protected int a2;
    int a3;

    private void printA1() {
        System.out.println("a1");
    }

    protected void printA2() {
        System.out.println("a2");
    }

    void printA3() {
        System.out.println("a3");
    }

    public static void main(String[] args) {
        D q = new D();
        q.a1 = 4;
        q.a2 = 3;
        q.a3 = 2;
        q.printA1();
        q.printA2();
        q.printA3();

    }
}