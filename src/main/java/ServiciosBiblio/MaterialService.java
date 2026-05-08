package ServiciosBiblio;

import Materiales.Libros;
import Materiales.Material;
import Materiales.Revistas;
import Materiales.Tesis;

import java.util.ArrayList;
import java.util.List;

public class MaterialService {
    private List<Material> materiales = new ArrayList<>();
    public void registrarMaterial(Material m) { //crea em metodo que tiene como parametro m que es de tipo material
        materiales.add(m);
    }
    public void mostrarMateriales() {
        for (Material m : materiales) {
            System.out.println("Codigo - Titulo - Año de publicacion");
            System.out.println(m.getCodigo() + " - " + m.getTitulo() + " (" + m.getAnioPublicacion() + ")");
        }
    }
    public void mostrarDetalles(Material m) {
        System.out.println("Código: " + m.getCodigo());
        System.out.println("Título: " + m.getTitulo());
        System.out.println("Año: " + m.getAnioPublicacion());

        if (m instanceof Libros) {
            System.out.println("Autor: " + ((Libros) m).getAutor());
        } else if (m instanceof Tesis) {
            System.out.println("Universidad: " + ((Tesis) m).getUniversidad());
        } else if (m instanceof Revistas) {
            System.out.println("Número de edición: " + ((Revistas) m).getNumeroEdicion());
        }
    }
    public Material buscarPorCodigo(String codigo) {
        for (Material m : materiales) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                return m;
            }
        }
        return null;
    }

}
