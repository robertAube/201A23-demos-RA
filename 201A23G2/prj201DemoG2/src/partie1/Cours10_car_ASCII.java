package partie1;

public class Cours10_car_ASCII {
    public Cours10_car_ASCII() {
        jouerAvecChar();
    }
    private void jouerAvecChar() {
        char lettre;

        //lettre = "a"; //On ne peut pas mettre une chaine de caractère dans un char
        lettre = 'a'; //constante char a

        System.out.println(lettre);

        System.out.println("Canad" + lettre);
        System.out.println((int)lettre);
//
        System.out.println((char) (lettre + 1));
        System.out.println((char) 107); //Voir la table ASCII
    }

    public static void main(String[] args) {
        new Cours10_car_ASCII();
    }
}
