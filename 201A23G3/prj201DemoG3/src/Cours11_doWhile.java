import java.util.Scanner;

public class Cours11_doWhile {
    public Cours11_doWhile() {
//        appuyerSurEspaceEtEnterPourContinuer_while();
        appuyerSurEspaceEtEnterPourContinuer_dowhile();
    }


    private void appuyerSurEspaceEtEnterPourContinuer_dowhile() {
        String strSaisie;
        //boucler sur cette question tant que l'usager n'a pas appuyée sur la barre d'espacement puis sur Enter.

        do { //on fait une intération au minimum (on fait au moins une fois la boucle)
            strSaisie = lireString("SVP appuyer sur la barre d'espacement puis sur Enter : ");
            System.out.println("\"" + strSaisie + "\"");
        } while (!strSaisie.equals(" ")); //condition après
        System.out.println("Bravo d'avoir appuyé sur l'espace");
    }

    private void appuyerSurEspaceEtEnterPourContinuer_while() {
        String strSaisie;
        //boucler sur cette question tant que l'usager n'a pas appuyée sur la barre d'espacement puis sur Enter.

        strSaisie = lireString("SVP appuyer sur la barre d'espacement puis sur Enter : ");

        while (!strSaisie.equals(" ")) { //on est pas certain d'entrer dans la boucle
            System.out.println("\"" + strSaisie + "\"");
            strSaisie = lireString("SVP appuyer sur la barre d'espacement puis sur Enter : ");
        }

        System.out.println("Bravo d'avoir appuyé sur l'espace");
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
        new Cours11_doWhile();
    }
}
