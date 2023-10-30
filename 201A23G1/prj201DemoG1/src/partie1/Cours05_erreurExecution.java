package partie1;

public class Cours05_erreurExecution {
    public Cours05_erreurExecution() {
        int i;
        String strNb;

        strNb = "123";

        i = convertirStringEnInt (strNb);
        System.out.println(strNb + " --> " + i);


        strNb = "123a";

        i = convertirStringEnInt (strNb);
        System.out.println(strNb + " --> " + i);
    }

    private int convertirStringEnInt(String strNb) {
        int nbInt;
        nbInt = Integer.parseInt(strNb);
        return nbInt;
    }

    public static void main(String[] args) {
        new Cours05_erreurExecution();
    }
}
