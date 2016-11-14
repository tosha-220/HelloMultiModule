package client;
import server.Hello;

public class CallingHello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.printHello();
    }
}
