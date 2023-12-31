package partie2.cours19_ObjectSuite;

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
    public static final int MIN_XY = -100;
    public static final int MAX_XY = -MIN_XY;

    public Pizza(int x, int y, int vitesse, String couleur) { //Constructeur
        setX(x);  //le mot clé this fait référence à l'instance courante.
        setY(y); //variable d'instance mauve & variable locale noire
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public void avancerX() {
        x += vitesse;
    }


    public void setX(int x) { //mutateur : permet de modifier une variable d'instance
        if (xyEstValide(x)) {
            this.x = x;  //le mot clé this fait référence à l'instance courante.
        } else {
            //On lance une exception de type IllegalArgumentException avec un message.
            throw new IllegalArgumentException(x + " est une valeur invalide (" + MIN_XY + ", " + MAX_XY + ")" );
        }
    }
    public void setY(int y) { //mutateur : permet de modifier une variable d'instance
        if (xyEstValide(y)) {
            this.y = y;  //le mot clé this fait référence à l'instance courante.
        } else {
            //On lance une exception de type IllegalArgumentException avec un message.
            throw new IllegalArgumentException(y + " est une valeur invalide (" + MIN_XY + ", " + MAX_XY + ")" );
        }
    }
    public int getX() { //accesseur : permet de lire une variable d'instance
        return x;
    }

    //static : appartient à la classe et peut-être accéder avec Pizza.xEstValide(2)
    public static boolean xyEstValide(int x) {
        return (MIN_XY <= x && x <= MAX_XY);
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
