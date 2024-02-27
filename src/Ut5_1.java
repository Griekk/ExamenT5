import java.util.*;

public class Ut5_1 {
    public static void main(String[] args) {
        Set<Integer> conjunto = new TreeSet<>();
        Random r = new Random();
        int n = 0;

        for (int i = 0; i < 6; i++) {
            conjunto.add(r.nextInt(49) + 1);
        }

        System.out.println("Apuesta: " + conjunto);

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                if (n == 0) {
                    System.out.print("\t");
                } else if (conjunto.contains(n)) {
                    System.out.print("XX \t");
                } else {
                    System.out.print(n + "\t");
                }
                n++;

            }
        }

    }
}