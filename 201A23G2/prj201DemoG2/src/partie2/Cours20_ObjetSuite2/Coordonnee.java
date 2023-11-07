package partie2.Cours20_ObjetSuite2;

import java.awt.*;

public class Coordonnee {
    private int x;
    private int y;

    public static final int XY_DEFAUT = 0;
    public static final int MIN_XY = Integer.MIN_VALUE;
    public static final int MAX_XY = Integer.MAX_VALUE;

    public Coordonnee() {
        this(XY_DEFAUT, XY_DEFAUT);
    }

    public Coordonnee(int x, int y) {
        Point p;
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public Coordonnee getCoordonnee() {
        return new Coordonnee(x, y);
    }

    public void setCoordonnee(Coordonnee coordonnee) {
        x = coordonnee.x; //pas besoin de validation : coordonne est déjà validé
        y = coordonnee.y;  //notez que le get n'a pas été utlisié. J'ai accès aux propriétés de ma propre classe même s'ils sont private.
    }

    public void setX(int x) {
        if (xyEstValide(x)) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("Coordonné X est invalide " + x + " : elle doit être entre " + MIN_XY + " et " + MAX_XY);
        }
    }

    public void move(int x, int y) {
        setX(x);
        setY(y);
    }

    public void deplacement(int deltaX, int deltaY) {
        move(x + deltaX, y + deltaY);
    }

    public static boolean xyEstValide(int coordonnee) {
        boolean estValide = MIN_XY <= coordonnee && coordonnee <= MAX_XY;
        return estValide;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (xyEstValide(y)) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("Coordonné Y est invalide " + y + " : elle doit être entre " + MIN_XY + " et " + MAX_XY);
        }
    }

    @Override
    public String toString() {
        return '(' + x + ", " + y + ')';
    }
}
