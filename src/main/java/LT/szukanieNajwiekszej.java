package LT;

import java.util.ArrayList;
import java.util.List;

public class szukanieNajwiekszej {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(3);
        lista.add(7);

        System.out.println(getMaxInt(lista));
    }

    public static int getMaxInt(List<Integer> myList) {

        int result = 0;
        int size = myList.size();

        for (int i = 0; i < size; i++) {
            if (myList.get(i) > result) {
                result = myList.get(i);
            }
        }
        return result;
    }
}
