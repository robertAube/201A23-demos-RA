public class Trace201Quiz1G2 {
    public Trace201Quiz1G2() {
        int a = 3;
        System.out.println("1. a=" + a);
        afficherPourTracer1(2 + a);
        System.out.println("2. a=" + a);
    }

    private void afficherPourTracer1(int i) {
        int j = 3;
        int a = 0;
        System.out.println("3. i=" + i + " j=" + j + " a=" + a);
        j = afficherPourTracer2(i, i + j);
        a = a - 3;
        System.out.println("4. i=" + i + " j=" + j + " a=" + a);
    }

    private int afficherPourTracer2(int i, int j) {
        System.out.println("5. i=" + i + " j=" + j);
        i = j + 1;
        System.out.println("6. i=" + i + " j=" + j);
        return j - i;
    }

    public static void main(String[] args) {
        System.out.println("7");
        new Trace201Quiz1G2();
        System.out.println("8");
    }
}
