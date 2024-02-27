import java.util.*;

public class Ut5_2 {
    public static void main(String[] args) {
        int n;
        float media = 0;
        int contador = 0;
        List<Integer> clase = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        do {
            n = sc.nextInt();
            if(n < 0) break;
            contador++;
            media= media + n;
            clase.add(n);
        } while (true);

        media = media/contador;
        System.out.println("La edad media es: " + media);


        Iterator<Integer> iter = clase.iterator();
        int mayores = 0;
        int menores = 0;
        while (iter.hasNext()) {
            int edadEstudiante = iter.next();
            if (edadEstudiante >= media) {
                mayores++;
            } else {
                menores++;
            }
        }

        System.out.printf("Hay %d personas por encima de la media\n", mayores);
        System.out.printf("Hay %d personas por debajo de la media", menores);






    }
}
