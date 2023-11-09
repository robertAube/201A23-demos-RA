package partie2.Cours20_ObjetSuite;

public class Pizza {
    //Attributs ou variables d'instance
    //Pour qu'elle existe, elles doivent-être instanciés avec un new
    //encapsulation des variables d'instance : on les met private pour éviter qu'on les modifie. La classe a alors le plein contrôle.
    private Coordonnee coordonnee;
    private int vitesse;
    private String couleur;

    //Constantes de classe
    //constante : valeur qui ne peut pas changer. norme : Toujours en majuscule
    //static : appartien à la classe: existe toujours! (en existe qu'une... peu importe le nombre d'instances)
    //final : la variable ne peut pas être changé.
    public static final int MIN_XY = -100;
    public static final int MAX_XY = -MIN_XY;

    public Pizza(int x, int y, int vitesse, String couleur) { //Constructeur
        coordonnee = new Coordonnee(); //On doit instancier la coordonnée
        setX(x);  //le mot clé this fait référence à l'instance courante.
        setY(y); //variable d'instance mauve & variable locale noire
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public void avancerX() {
        coordonnee.setX(coordonnee.getX() + vitesse);
    }

    public void setX(int x) { //mutateur : permet de modifier une variable d'instance
        if (xyEstValide(x)) {
            coordonnee.setX(x);  //le mot clé this fait référence à l'instance courante.
        } else {
            //On lance une exception de type IllegalArgumentException avec un message.
            throw new IllegalArgumentException(x + " est une valeur invalide (" + MIN_XY + ", " + MAX_XY + ")");
        }
    }

    public void setY(int y) { //mutateur : permet de modifier une variable d'instance
        if (xyEstValide(y)) {
            coordonnee.setY(y);  //le mot clé this fait référence à l'instance courante.
        } else {
            //On lance une exception de type IllegalArgumentException avec un message.
            throw new IllegalArgumentException(y + " est une valeur invalide (" + MIN_XY + ", " + MAX_XY + ")");
        }
    }

    public int getX() { //accesseur : permet de lire une variable d'instance
        return coordonnee.getX();
    }

    public int getY() { //accesseur : permet de lire une variable d'instance
        return coordonnee.getY();
    }


    public void set(Pizza pizza) {
        this.coordonnee.setX(pizza.coordonnee.getX()); //"pizza.coordonnee.getX()" fait référence à la pizza reçue en argument
        //"this.coordonnee.setX" fait référence à l'objet courant.
        this.coordonnee.setY(pizza.coordonnee.getY()); //"pizza.coordonnee.getX()" fait référence à la pizza reçue en argument

        this.coordonnee = pizza.coordonnee; // si on fait ça les 2 pizzas (this et la pizza reçue en argument) vont partager la même coordonnée.

        this.vitesse = pizza.vitesse;
        this.couleur = pizza.couleur;
    }

    /**
     * Retourne une nouvelle pizza construite à partir de l'instance courante.
     * @return une nouvelle pizza construite à partir de l'instance courante
     */
    public Pizza getPizza() {
        Pizza p = new Pizza(coordonnee.getX(), coordonnee.getY(), vitesse, couleur);
        return p;
    }

    //static : appartient à la classe et peut-être accéder avec Pizza.xEstValide(2)
    public static boolean xyEstValide(int x) {
        return (MIN_XY <= x && x <= MAX_XY);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
