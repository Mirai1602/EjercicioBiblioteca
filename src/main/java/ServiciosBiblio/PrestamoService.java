package ServiciosBiblio;

import Materiales.Material;

import java.util.HashMap;
import java.util.Map;

public class PrestamoService {
    private Map<String, Boolean> estadoPrestamos = new HashMap<>();
    public void realizarPrestamo(Material m) {
        if (!estadoPrestamos.getOrDefault(m.getCodigo(), false)) {
            estadoPrestamos.put(m.getCodigo(), true);
            System.out.println("Préstamo realizado: " + m.getTitulo());
        } else {
            System.out.println("El material ya está prestado.");
        }
    }
    public void realizarDevolucion(Material m) {
        if (estadoPrestamos.getOrDefault(m.getCodigo(), false)) {
            estadoPrestamos.put(m.getCodigo(), false);
            System.out.println("Devolución realizada: " + m.getTitulo());
        } else {
            System.out.println("El material no estaba prestado.");
        }
    }
}

