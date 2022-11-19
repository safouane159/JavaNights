public class OrderOfInitialization {

    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    OrderOfInitialization() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new OrderOfInitialization();
    }

    {
        add(8);
    }
    void method() { }

    public static void main(String[] args) {
        System.out.println("hello world");
        OrderOfInitialization c = new OrderOfInitialization();
        c.method();
    }



}
// output 2 4 6 8 5 hello world