package Materiales;

import jakarta.validation.constraints.NotBlank;

import java.util.Scanner;

public class Libros implements Material {
    //Cada material debe de contener estos tres atributos
    @NotBlank(message = "El campo no puede estar vacío")
    private String codigo;
    @NotBlank(message = "El campo no puede estar vacío")
    private String titulo;
    @NotBlank(message = "El campo no puede estar vacío")
    private int anioPublicacion;
    @NotBlank(message = "El campo no puede estar vacío")
    private String autor;


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

    public String getAutor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del autor del libro");
    }
}
