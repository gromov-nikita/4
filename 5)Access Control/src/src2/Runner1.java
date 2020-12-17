package src2;
public class Runner1 {
    private int a1;
    protected int a2;
    int a3;

    public int getA1() {
        return a1;
    }

    public int getA2() {
        return a2;
    }

    public int getA3() {
        return a3;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public void setA3(int a3) {
        this.a3 = a3;
    }

    public static void main(String[] args) {
        Runner1 q = new Runner1();
        q.setA1(4);
        q.a2 = 3;
        q.a3 = 2;
        System.out.println(q.getA1());
        System.out.println(q.a2);
        System.out.println(q.a3);

    }
}