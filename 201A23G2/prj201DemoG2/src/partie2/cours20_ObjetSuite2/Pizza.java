package partie2.cours20_ObjetSuite2;

public class Pizza {
    //Attributs ou variables d'instance
    //Pour qu'elle existe, elles doivent-être instanciés avec un new
    //encapsulation des variables d'instance : on les met private pour éviter qu'on les modifie. La classe a alors le plein contrôle.
    private Coordonnee coordonnee;
    private int vitesse;
    private String couleur;

    //Constantes de classe : EXISTE TOUJOURS
    //contante : valeur qui ne peut pas changer. norme : Toujours en majuscule
    //static : appartient à la classe: existe toujours! (en existe qu'une... peu importe le nombre d'instances)
    //final : la variable ne peut pas être changé
    public static final int MIN_XY = -100;
    public static final int MAX_XY = 100;

    public static final int X_DEFAUT = 0;
    public static final int Y_DEFAUT = 0;
    public static final int VITESSE_DEFAUT = 0;
    public static final String COULEUR_DEFAUT = "sans couleur";


    public Pizza() { //constructeur par défaut
        this(X_DEFAUT, Y_DEFAUT); //this permet d'appeler à l'intérieur de la classe un constructeur
    }

    public Pizza(int x, int y) { //Constructeur
        this(x, y, VITESSE_DEFAUT, COULEUR_DEFAUT); //this permet d'appeler à l'intérieur de la classe un constructeur
    }

    public Pizza(int x, int y, int vitesse, String couleur) { //Constructeur
        coordonnee = new Coordonnee(x ,y);
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public void setXY(int x, int y) { //mutateur
        if (xyEstValide(x, y)) {
            coordonnee.move(x, y);
        } else {
            throw new IllegalArgumentException("(" + x + ", " + y + ") est invalide. Plage valide = [" + MAX_XY + ", " + MAX_XY + "]");
        }
    }

    public Pizza get() {
        Pizza p = new Pizza(coordonnee.getX(), coordonnee.getY(), vitesse, couleur);
        return p;
    }

    public void set(Pizza pizza) {
        coordonnee.move(pizza.coordonnee.getX(), pizza.coordonnee.getY());

        vitesse = pizza.vitesse; //pizza.vitesse accès à la vitesse de l'instance reçu en argument
        couleur = pizza.couleur; //comme on est dans la classe pizza pas besoin d'utiliser les accesseurs (get);
    }

    public static boolean xyEstValide(int x, int y) { //static : lié à la classe. Pas besoin d'instance pour l'utiliser. N'accède pas les variables de l'instance.
        boolean estValide;
        estValide = MIN_XY <= x && x <= MAX_XY;
        estValide &= MIN_XY <= y && y <= MAX_XY;
        return estValide;
    }

    public void avancerX() {
        coordonnee.deplacement(vitesse, 0);
    }


    @Override
    public String toString() {
        return "Pizza{" + coordonnee +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
