/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num_alumnno = 4;//numeros de alumnos y limite del arreglo
        int contador = 1;//contador del while
        
        Estudiante lista_estudiantes[] = new Estudiante[num_alumnno]; //creacion y declaracion del arreglo
        double[] notas_matematicas = new double[num_alumnno]; 
        double[] notas_sociales = new double[num_alumnno]; 
        
        //ciclo repetitivo para ingresar los datos de cada alumnos
        while(contador<=num_alumnno){
            //Excepcion para convetir los strings a double
            try{
                System.out.println("Ingrese el nombre:");
                String nombre = leer.nextLine();
                System.out.println("Ingrese el apellido:");
                String apellido = leer.nextLine();
                lista_estudiantes[contador] = new Estudiante(nombre, apellido);
                
                System.out.println("Ingrese la nota de matematicas");
                double mat = Double.parseDouble(leer.nextLine());
                notas_matematicas[contador] = mat;
                System.out.println("Ingrese la nota de sociales");
                double soc = Double.parseDouble(leer.nextLine());
                notas_sociales[contador] = soc;
                contador++;
                
            }catch(NumberFormatException e){
                System.err.print(e);
                //Para volver a pedir que el usuario ingrese un numero
                System.out.println("La nota debe ser un numero");
            }
            
        }
        //Mostramos datos
        Asignacion a = new Asignacion(lista_estudiantes, notas_matematicas, notas_sociales);
        System.out.println(a);
        
        
        
    }
    
}
