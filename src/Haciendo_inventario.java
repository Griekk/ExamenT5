import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Haciendo_inventario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        Set<String> conjunto = new HashSet<>();

        while (true) {
            n = sc.nextInt();
            sc.nextLine();
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                conjunto.add(sc.nextLine().toLowerCase());
            }
            System.out.println( conjunto.size() );
            conjunto.clear();
        }

    }

}