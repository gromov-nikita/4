import java.sql.SQLOutput;

/*
Exercise 8: (4) Following the form of the example Lunch.java, create a class called
ConnectionManager that manages a fixed array of Connection objects. The client
programmer must not be able to explicitly create Connection objects, but can only get them
via a static method in ConnectionManager. When the ConnectionManager runs out of
objects, it returns a null reference. Test the classes in main( ).
 */
public class ConnectionManager {
    private static Connection[] collect = new Connection[5];
    private static int size = 0;
    public static Connection getRef() {
        if(size < 5) {
            return collect[size++] = new Connection(size);
        }
        else{
            return null;
        }
    }
    public static void main(String[] args) {
        Connection obj1 = ConnectionManager.getRef();
        Connection obj2 = ConnectionManager.getRef();
        Connection obj3 = ConnectionManager.getRef();
        Connection obj4 = ConnectionManager.getRef();
        Connection obj5 = ConnectionManager.getRef();
        Connection obj6 = ConnectionManager.getRef();
        try {
            obj1.setN(1);
            obj2.setN(2);
            obj3.setN(3);
            obj4.setN(4);
            obj5.setN(5);
            //obj6.setN(3);
            System.out.println(obj1.getN());
            System.out.println(obj2.getN());
            System.out.println(obj3.getN());
            System.out.println(obj4.getN());
            System.out.println(obj5.getN());
            //System.out.println(obj6.getN());
        }catch (NullPointerException t){
            System.out.println("Overflow");
        }
    }
}
