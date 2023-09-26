public class Cours11_exercicesPrepQuiz {
//    o	Trouver l’énoncé boolean java pour avoir true selon le cas (n et m sont des réels)  :
//          	n → [-1, 16[
//              n >= -1 && n < 16
//          	n → [1, 4] et m → ]1,4]
//              n >= 1 && n <= 4 && m > 1 && m <= 4
//          	c → ['1', 'Z'[
//              c >= '1' && c < 'Z'

//    o	Trouver l’énoncé boolean java pour avoir true si un variable nb est dans l'intervalle suivant :
//          	]1, 10]   U   [20, 30[
//              (nb > 1 && nb <= 10) || (nb >=20 && nb < 30)

    public Cours11_exercicesPrepQuiz() {
     //   exercice();
        jouerAvecLEgaliteDesStrings();
    }

    private void exercice() {
        int i = 4;

        System.out.println("1 - i = " + i);
        while (i > 0) {
            System.out.print("2 - i = " + i);
            if (i % 2 == 0) { //Si c'est pair
                System.out.print(" - i x 2 = " + i * 2);
            } else { //si c'est impair
                System.out.print(" - i x 3 = " + i * 3);
            }
            System.out.print('\n'); //saut de ligne
            i -= 1;
        }
        System.out.println("3 - i = " + i);
    }

    private void jouerAvecLEgaliteDesStrings() {
        String str1, str2;

        str1 = "abc";
        System.out.println(str1.equals("abc")); // true
        str1 = "abc";
        System.out.println(str1.equals("aBc")); // false
        str1 = "abc";
        System.out.println(str1.equalsIgnoreCase("aBc")); // true
        str1 = "abc";
        str2 = "abc";
        System.out.println(str1.equals(str2)); // true
        str1 = "";
        System.out.println(str1.equals("")); // true
        str1 = "abc ";
        System.out.println(str1.equals("abc")); // false
        str1 = "abc ";
        System.out.println(str1.toUpperCase()); // ABC
        System.out.println(str1); // abc
        str1 = str1.toUpperCase();
        System.out.println(str1); // ABC

        str1 = "   Jean a un problème.   ";
        System.out.println('"' + str1 + '"');
        str1 = str1.trim(); //retire les blancs du début et de la fin
        System.out.println('"' + str1 + '"');
    }

    public static void main(String[] args) {
        new Cours11_exercicesPrepQuiz();
    }
}
