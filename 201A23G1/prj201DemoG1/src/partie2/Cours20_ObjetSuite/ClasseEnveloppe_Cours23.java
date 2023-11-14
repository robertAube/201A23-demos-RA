package partie2.Cours20_ObjetSuite;

public class ClasseEnveloppe_Cours23 {
    public ClasseEnveloppe_Cours23() {
        jouerAvecUnTableauDObjets1();
    }
    private void jouerAvecUnTableauDObjets1() {
        Object[] tabObjets = {new Pizza(2,3,5,"jaune"), new Coordonnee(4,3), "Allo", 2.1 , false};
        Double d = 2.7;

        System.out.println(d + " - " + d.getClass().getSimpleName() + " - " + d.getClass().getName());

        for (int i = 0; i < tabObjets.length; i++) {
            System.out.println(tabObjets[i] + " - " + tabObjets[i].getClass().getSimpleName() + " - " + tabObjets[i].getClass().getName());
            //  ((Pizza)tabObjets[i]).avancerX(); //Comme tous les objets ne sont pas des Pizzas, ça fait une erreur d'exécution
        }
    }
    public static void main(String[] args) {
        new ClasseEnveloppe_Cours23();
    }
}
