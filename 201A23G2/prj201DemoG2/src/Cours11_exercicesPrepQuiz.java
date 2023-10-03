public class Cours11_exercicesPrepQuiz {
//    o	Trouver l’énoncé boolean java pour avoir true selon le cas (n et m sont des réels)  :
//          	n → [-1, 16[
//              rep: n >= -1 && n < 16
//          	n → [1, 4] et m → ]1,4]
//              rep: (n >=1 && n <= 4) && (m > 1 && m <=4)
//          	c → ['1', 'Z'[
//              rep: c >= '1' && c < 'Z'

//    o	Trouver l’énoncé boolean java pour avoir true si un variable nb est dans l'intervalle suivant :
//          	]1, 10]   U   [20, 30[
//              rep: (nb > 1 && nb <= 10) || (nb >= 20 && nb < 20)

    public Cours11_exercicesPrepQuiz() {
        exercice();
        jouerAvecLEgaliteDesStrings();
    }

    private void exercice() {
        int i = 4;

        System.out.println("1 - i = " + i);
        while (i > 0) { //4 itérations
            System.out.print("2 - i = " + i);
            if (i % 2 == 0) { //si i est pair
                System.out.print(" - i x 2 = " + i * 2);
            } else { //si i est impair
                System.out.print(" - i x 3 = " + i * 3);
            }
            System.out.print('\n');
            i -= 1;
        }
        System.out.println("3 - i = " + i);
    }
/*
1 - i = 4
2 - i = 4 - i x 2 = 8
2 - i = 3 - i x 3 = 9
2 - i = 2 - i x 2 = 4
2 - i = 1 - i x 3 = 3
3 - i = 0
 */

    private void jouerAvecLEgaliteDesStrings() {
        String str1, str2; //toUpper(), toLower(), length(), charAt(), equals(), equalsIgnoreCase(), trim()

//        str1 = "abc";
//        System.out.println(str1.equals("abc")); //true
//        str1 = "abc";
//        System.out.println(str1.equals("aBc")); //false
//        str1 = "abc";
//        System.out.println(str1.equalsIgnoreCase("aBc")); //true
//        str1 = "abc";
//        str2 = "abc";
//        System.out.println(str1.equals(str2)); // true
//        str1 = "";
//        System.out.println(str1.equals("")); //true
        str1 = "   abc \n";
        System.out.println(str1.equals("abc")); //false

        str1 = str1.trim();
        System.out.println("str1 = \"" + str1 + "\"");
        System.out.println(str1.equals("abc")); //true
    }

    public static void main(String[] args) {
        new Cours11_exercicesPrepQuiz();
    }
}
