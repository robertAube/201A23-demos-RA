package _util;

import java.util.Scanner;

public class UtilSaisie {


    /**
     * Lit une chaine de caractère au clavier et la retourne.
     *
     * @param question la question affichée pour l'utilisateur
     * @return la réponse saisit par l'utilisateur
     */
    public static String lireString(String question) {
        String reponseStr;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponseStr = sc.nextLine();

        return reponseStr;
    }

    /**
     * Lit un entier au clavier
     *
     * @param question la question affichée pour l'utilisateur
     * @return la réponse saisit par l'utilisateur qui devrait être un entier. Sinon, il y a erreur exécution.
     */
    public static int lireInt(String question) {
        String reponse;
        int reponseInt;

        reponse = lireString(question);
        reponseInt = Integer.parseInt(reponse);

        return reponseInt;
    }
}
