public class Cours03Tracer {
    public Cours03Tracer() {
        System.out.println("1");
        abc();
        System.out.println("2");
        def(1, 2, 5);
        System.out.println("3");
    }

    private void def(int x, int y, int z) {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
        System.out.println(x + y + z);
        abc();
        System.out.println("4");
    }

    private void abc() {
        int a;
        a = 4;
        a = a * 2;
        System.out.println("5");
        System.out.println(a);
        System.out.println("6");
    }

    public static void main(String[] args) {
        System.out.println("7");
        new Cours03Tracer();
        System.out.println("8");
    }
}
