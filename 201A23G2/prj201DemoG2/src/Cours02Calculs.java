public class Cours02Calculs {
    public Cours02Calculs() {
        afficher1Plus1(); //ALT-ENtER pour créer la méthode
    }

    private void afficher1Plus1() {
        System.out.print("1 + 1 = "); //chaine de caractères
        System.out.println(1 + 1); //calcul
    }

    public static void main(String[] args) {
        new Cours02Calculs();
    }
}
