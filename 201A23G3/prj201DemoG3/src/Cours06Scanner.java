import java.util.Scanner;

public class Cours06Scanner {
    public Cours06Scanner() {
        lireAuclavierEtAfficherNom();
        lireAuclavierEtAfficherPrenom();
    }

    private void lireAuclavierEtAfficherNom() {
        Scanner sc; //Classe utilitaire de lecture au clavier
        String strNom;

        sc = new Scanner(System.in); //instanciation de l'utilitaire de lecture au clavier

        System.out.print("Entrez votre nom : ");
        // Attendre que l'usager entre des caractères au clavier et appuie 'Entrée'.
        // Les caractères entrés sont affectés à la variable strNom.
        strNom = sc.nextLine();

        System.out.println("Votre nom est : " + strNom + '.');
    }

    private void lireAuclavierEtAfficherPrenom() {
        Scanner sc; //Classe utilitaire de lecture au clavier
        String strPrenom;

        sc = new Scanner(System.in); //instanciation de l'utilitaire de lecture au clavier

        System.out.print("Entrez votre prénom : ");
        // Attendre que l'usager entre des caractères au clavier et appuie 'Entrée'.
        // Les caractères entrés sont affectés à la variable strPrenom.
        strPrenom = sc.nextLine();

        System.out.println("Votre prénom est : " + strPrenom + '.');
    }

    public static void main(String[] args) {
        new Cours06Scanner();
    }
}
