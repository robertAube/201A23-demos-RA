package partie2.Cours18_Objet;

public class Pizza {
    //attributs ou variables d'instance
    //Pour qu'elles existent, elles doivent-être instanciées avec un new
    private int x;
    private int y;
    private int vitesse;
    private String couleur;

    Pizza(int x, int y, int vitesse,  String couleur) {
        setXY(x, y);
        this.couleur = couleur;
        this.vitesse = vitesse;
    }

    public void setXY(int x, int y) {
        this.x = x; //this fait référence à l'instance courante
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void avancerX() {
        x += vitesse;
    }

    public String toString() { //méthode standard en java
        return "Pizza{" +
                "x=" + x +
                ", y=" + y +
                ", vitesse=" + vitesse +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
