/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    //Atributos de la clase
    private String nombre;
    private String apellido;
    
    //Metodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Constructor con 2 parametros de la clase
    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Constructor vacio
    public Estudiante() {
    }

    //Sobreescribimos el metodo toString
   @Override
    public String toString() {
        return String.format("%s %s"
                ,getNombre(),getApellido());
    }
    
    
}
