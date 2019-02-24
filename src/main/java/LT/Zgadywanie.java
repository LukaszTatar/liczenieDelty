package LT;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanie {

    public static void main(String[] args) {

        int x = getRandomInt();
        sprawdz(x);
    }

    public static void sprawdz(int x) {
        int liczba = getUserValue();
        if (x == liczba) {
            System.out.println("sukces");
        } else if (x > liczba) {
            System.out.println("x jest większa");
            sprawdz(x);
        } else {
            System.out.println("x jest mniejsza");
            sprawdz(x);
        }
    }

    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int getUserValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        return scanner.nextInt();
    }
}
