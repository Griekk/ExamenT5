import javax.sound.midi.Soundbank;
import java.net.Socket;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ut5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Producto> almacen = new LinkedHashSet<>();

        while (true) {
            System.out.println("Introduce el código del producto y la fecha de caducidad separados por espacios (FIN para finalizar): ");
            String codigo = sc.next();
            if (codigo.equalsIgnoreCase("FIN")) {
                break;
            }

            Producto producto = new Producto(codigo);

            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int anho = sc.nextInt();

            LocalDate fechaCaducidad = LocalDate.of(anho, mes, dia);

            if (almacen.contains(producto)) {
                if (producto.getFechaCaducidad().isBefore(fechaCaducidad)) {
                    producto.setFechaCaducidad(fechaCaducidad);
                    System.out.println("Producto existente. Actualizado");
                } else {
                    System.out.println("Producto existente. No se actualiza");
                }
            } else {
                almacen.add(producto);
                producto.setFechaCaducidad(fechaCaducidad);
                System.out.println("Nuevo producto. Registrado");
            }

        }

        System.out.println("LISTADO DE ALMACEN");

        LocalDate fechaMasAntigua = null;
        for (Producto producto : almacen) {
            System.out.println("Producto: " + producto.getCodigo() + " -> " + producto.getFechaCaducidad());
            if (fechaMasAntigua == null || producto.getFechaCaducidad().isBefore(fechaMasAntigua)) {
                fechaMasAntigua = producto.getFechaCaducidad();
            }
        }


    }
}

