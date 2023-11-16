package partie2.cours18_Objet;

public class Pizza {
    //attributs ou variables d'instance
    //Pour qu'elle existe, elles doivent-être instanciés avec un new
    //encapsulation des variables d'instance : on les met private pour éviter qu'on les modifie. La classe a alors le plein contrôle.
    private int x;
    private int y;
    private int vitesse;
    private String couleur;

    public Pizza(int x, int y, int vitesse, String couleur) { //Constructeur
        this.x = x;  //le mot clé this fait référence à l'instance courante.
        this.y = y; //variable d'instance mauve & variable locale noire
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public void avancerX() {
        x += vitesse;
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
