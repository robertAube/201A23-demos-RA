package partie2;

public class Cours24_switch {
    public String quelJour(int jour) {
        String typeTravail = "";

        switch (jour) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                typeTravail = "jour de travail";
                break;
            case 6:
            case 7:
                typeTravail = "jour de congé";
                break;
            default:
                typeTravail = "Invalide";
        }
        return typeTravail;
    }


}
