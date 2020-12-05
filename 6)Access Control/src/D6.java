import org.w3c.dom.ls.LSOutput;

public class D6 {
    protected int a;
    public void setA(int a) {
        this.a = a;
    }
    protected void printA(){
        System.out.println(a);
    }
}
class D {
    public static void main(String[] args) {
        D6 q = new D6();
        q.setA(q.a);
        System.out.println(q.a);
        q.a = 4;
        q.printA();
    }
}