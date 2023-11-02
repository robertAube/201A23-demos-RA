package partie2.Cours20_ObjetSuite;


public class Coordonnee {
    public static final int XY_DEFAULT = 0;
    public static final int XY_MIN = Integer.MIN_VALUE; //valeur minimum accepté par un int
    public static final int XY_MAX = Integer.MAX_VALUE;

    private int x;
    private int y;

    public Coordonnee() {
        this(XY_DEFAULT, XY_DEFAULT); //appel de mon constructeur avec paramètre
    }

    public Coordonnee(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (xyEstValide(x)) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("Coordonne X qui est " +  x + " et invalide : il doit être entre " + XY_MIN + " et " + XY_MAX);
        }
    }

    public static boolean xyEstValide(int coordonnee) {
        boolean estValide = XY_MIN <= coordonnee && coordonnee <= XY_MAX;
        return estValide;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (xyEstValide(y)) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("Coordonne Y qui est " +  y + " et invalide : il doit être entre " + XY_MIN + " et " + XY_MAX);
        }
    }

    public void move( int x, int y) {
        setX(x);
        setY(y);
    }

    public void deplacement(int dx, int dy) {
        move(x + dx, y + dy);
    }

    @Override
    public String toString() {
        return "Coordonnee{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
