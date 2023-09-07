import java.util.Scanner;

public class Cours06Scanner {
    public Cours06Scanner() {
        lireEtAfficherNom();
        lireEtAfficherPrenom();
    }

    private void lireEtAfficherPrenom() {
        Scanner sc; //Classe utilitaire de lecture au clavier
        String strPrenom;

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture au clavier

        System.out.print("Entrez votre prénom : ");
        strPrenom = sc.nextLine(); //attendre que l'usager entre des caractères au clavier et les retourner dans strNom
        System.out.println("Votre prénom est : " + strPrenom);
    }

    private void lireEtAfficherNom() {
        Scanner sc; //Classe utilitaire de lecture au clavier
        String strNom;

        sc = new Scanner(System.in); //Instanciation de l'utilitaire de lecture au clavier

        System.out.print("Entrez votre nom : ");
        strNom = sc.nextLine(); //attendre que l'usager entre des caractères au clavier et les retourner dans strNom
        System.out.println("Votre nom est : " + strNom);
    }

    public static void main(String[] args) {
        new Cours06Scanner();
    }
}
