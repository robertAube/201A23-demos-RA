package partie2.Cours19_ObjectSuite;

public class Pizza {
    //attributs ou variables d'instance
    //Pour qu'elle existe, elles doivent-être instanciés avec un new
    //encapsulation des variables d'instance : on les met private pour éviter qu'on les modifie. La classe a alors le plein contrôle.
    private int x;
    private int y;
    private int vitesse;
    private String couleur;

    //Constantes de classe
    //constante : valeur qui ne peut pas changer. norme : Toujours en majuscule
    //static : appartient à la classe : existe toujours (en existe qu'une)
    //final : la variable ne peut pas être changé.
    public static final int MIN_X = -100;
    public static final int MAX_X = -MIN_X;

    public Pizza(int x, int y, int vitesse, String couleur) { //Constructeur
        this.x = x;  //le mot clé this fait référence à l'instance courante.
        this.y = y; //variable d'instance mauve & variable locale noire
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public void avancerX() {
        x += vitesse;
    }


    public void setX(int x) { //mutateur : permet de modifier une variable d'instance
        if (xEstValide(x)) {
            this.x = x;  //le mot clé this fait référence à l'instance courante.
        } else {
            //On lance une exception de type IllegalArgumentException avec un message.
            throw new IllegalArgumentException(x + " est une valeur invalide (" + MIN_X + ", " + MAX_X + ")" );
        }
    }

    public int getX() { //accesseur : permet de lire une variable d'instance
        return x;
    }

    //static : appartient à la classe et peut-être accéder avec Pizza.xEstValide(2)
    public static boolean xEstValide(int x) {
        return (MIN_X <= x && x <= MAX_X);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + x +
                ", y=" + y +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
