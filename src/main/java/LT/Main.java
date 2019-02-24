package LT;

public class Main {
    public static void main(String[] args) {
        int delta = 0;
        delta = delta(2, 2, 2);
        String wynik = sprawdz(delta);
        System.out.println(wynik);

        System.out.println(sprawdz(delta(2, 4, 2)));

        System.out.println(sprawdz(delta(-1, 3, 4)));


    }

    public static int delta(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static String sprawdz(int delta) {
        String result = "";
        if (delta == 0) {
            result = "jedno miejsce zerowe";
        }
        if (delta > 0) {
            result = "dwa miejsca zerowe";
        }
        if (delta < 0) {
            result = "brak miejsc zerowych";
        }
        return result;
    }
}
