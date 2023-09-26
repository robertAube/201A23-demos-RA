public class Cours11_plusplus_moinsmoins {
    public Cours11_plusplus_moinsmoins() {
        jouerAvec_plusplus_moinsmoins();
    }

    private void jouerAvec_plusplus_moinsmoins() {
        int i;
        int b;

        i = 1;
        System.out.println("i = " + i); // i = 1
        i++; //incrémentation (i += 1)
        System.out.println("i = " + i); // i = 2
        i--; //décrémentation (i -= 1)
        System.out.println("i = " + i); // i = 1

        ++i; //incrémentation (i += 1)
        System.out.println("i = " + i); // i = 2
        --i; //décrémentation (i -= 1)
        System.out.println("i = " + i); // i = 1

        System.out.println("++i = " + ++i); // ++i = 2
        System.out.println("i++ = " + i++); // i++ = 2
        System.out.println("i = " + i); // i = 3

        System.out.println("--i = " + --i); // --i = 2
        System.out.println("i-- = " + i--); // i-- = 2
        System.out.println("i = " + i); // i = 1

    }

    public static void main(String[] args) {
        new Cours11_plusplus_moinsmoins();
    }
}
