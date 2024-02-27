import java.time.LocalDate;

public class Producto {
    String codigo;
    LocalDate fechaCaducidad;

    public Producto(String codigo) {
        if (!codigo.matches("[A-Z]{2}-\\d{3}")) {
            throw new IllegalArgumentException("Formato no valido");
        }
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
