import java.util.Scanner;

public class Cours06Scanner {
    public Cours06Scanner() {
        lireAuClavierEtAfficherNom();
    }

    private void lireAuClavierEtAfficherNom() {
        Scanner sc;
        String strNom;

        sc = new Scanner(System.in);  //instanciation de l'utilitaire de lecture au clavier

        System.out.print("Entrez votre nom : ");

        //attendre que l'usager entre des caractères au clavier et appuie sur la touche 'Entrée'
        // Les caractères entrés sont affectés à la variable strNom (sans le 'Entrée')
        strNom = sc.nextLine();

        System.out.println("Votre nom est " + strNom + '.');
    }

    public static void main(String[] args) {
        new Cours06Scanner(); //instanciation
    }
}

