package partie1;

public class Cours04ErreurExecution {
    public Cours04ErreurExecution() {
        int i;
        String strNb ;


        strNb = "123";
        System.out.println("partie1.Cours04ErreurExecution");
        i = convertirStringEnInt(strNb);
        System.out.println(strNb + " --> " + i);
        strNb = "123g";
        i = convertirStringEnInt(strNb);
        System.out.println(strNb + " --> " + i);
    }

    private int convertirStringEnInt(String strNombre) {
        int nbInt;
        nbInt = Integer.parseInt(strNombre);
        return nbInt;
    }

    public static void main(String[] args) {
        new Cours04ErreurExecution();
    }
}
