import java.util.Scanner;
public class Cours12_doWhile {
    public Cours12_doWhile() {
        //appuyerSurEnterPourContinuer_while();
        appuyerSurEnterPourContinuer_dowhile();
    }


    private void appuyerSurEnterPourContinuer_dowhile() {
        String strSaisie;
        //boucler sur cette question tant que l'usager n'a pas appuyée sur la touche 'Entrée' seulement.

        do { //entrer au moins une fois dans la boucle
            strSaisie = lireString("SVP appuyez sur 'Entrée' seulement : ");
        } while (!strSaisie.equals("")); //la condition est vérifiée après une itération.

        System.out.println("Bravo d'avoir appuyé sur \"" + strSaisie + "\" puis 'Entrée' seulement");
    }


    private void appuyerSurEnterPourContinuer_while() {
        String strSaisie;
        //boucler sur cette question tant que l'usager n'a pas appuyée sur la touche 'Entrée' seulement.
        strSaisie = lireString("SVP appuyez sur 'Entrée' seulement : ");

        while (!strSaisie.equals("")) { //la condition est vérifiée avant d'entrer dans la boucle
            strSaisie = lireString("SVP appuyez sur 'Entrée' seulement : ");
        }

        System.out.println("Bravo d'avoir appuyé sur \"" + strSaisie + "\" puis 'Entrée' seulement");
    }

    private String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }
    public static void main(String[] args) {
        new Cours12_doWhile();
    }
}
