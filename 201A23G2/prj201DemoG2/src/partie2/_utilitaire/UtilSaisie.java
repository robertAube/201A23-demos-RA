package partie2._utilitaire;

import java.util.Scanner;

public class UtilSaisie {
    public static String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }

    public static int lireInt(String question) {
        int entierLu;
        entierLu = Integer.parseInt(lireString(question));
        return  entierLu;
    }
}
