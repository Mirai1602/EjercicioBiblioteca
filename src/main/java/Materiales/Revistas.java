package Materiales;

import java.util.Scanner;

public class Revistas implements Material {
    @NotBlank(message = "El campo no puede estar vacío")
    private String codigo;
    @NotBlank(message = "El campo no puede estar vacío")
    private String titulo;
    @NotBlank(message = "El campo no puede estar vacío")
    private int anioPublicacion;
    @NotBlank(message = "El campo no puede estar vacío")
    private int numEducion;
    @Override
    public String getCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al menu para ingresar codigo de libros");
        System.out.println("Inserte el Codigo del libro: ");
        codigo = sc.nextLine();
    }

    @Override
    public String getTitulo() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bienvenido al menu para ingresar el menu del libro: ");
        System.out.println("Ingrese el titulo del libro: ");
        titulo = sc.nextLine();
    }

    @Override
    public int getAnioPublicacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al menu para ingresar el año de publicacion");
        System.out.println("Ingrese el año: ");
        anioPublicacion = sc.nextInt();
    }

    public int getNumeroEdicion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al menu para ingresar el numero de edicion");
        System.out.println("Ingrese el numero de edicion de la revista: ");
        numEducion = sc.nextInt();
    }
}
