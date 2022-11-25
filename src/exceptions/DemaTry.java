package exceptions;

public class DemaTry {
    public static void main(String[] args) {
        try {
            throw new B();
        } catch (B a) {
            a.printT();
        }
    }
}