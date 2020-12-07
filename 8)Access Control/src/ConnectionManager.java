/*
Exercise 8: (4) Following the form of the example Lunch.java, create a class called
ConnectionManager that manages a fixed array of Connection objects. The client
programmer must not be able to explicitly create Connection objects, but can only get them
via a static method in ConnectionManager. When the ConnectionManager runs out of
objects, it returns a null reference. Test the classes in main( ).
 */
public class ConnectionManager {
    static Connection[] collect = new Connection[5];
    private static int size = 0;
    public static Connection getRef(){
        if(size < 5) {
            size++;
                return collect[size];
        }
        else{
            return null;
        }
    }
    public static void main(String[] args) {
        ConnectionManager.getRef();
        ConnectionManager.getRef();
        ConnectionManager.getRef();
    }
}
