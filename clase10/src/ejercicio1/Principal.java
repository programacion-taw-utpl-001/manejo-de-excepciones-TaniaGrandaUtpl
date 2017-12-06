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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double valor1=0, valor2=0;
        int num_alumnno = 4;
        int contador = 1;
        Estudiante lista[] = new Estudiante[4];
        double[] notas_matematicas = new double[4]; 
        double[] notas_sociales = new double[4]; 
        
        while(contador<4) {
            
            System.out.println("Ingrese el nombre:");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el apellido:");
            String apellido = leer.nextLine();
            Estudiante es = new Estudiante(nombre, apellido);
            
                       
            System.out.println("Ingrese su nota en la meteria de matematicas");
            String mat = leer.nextLine();
            
            System.out.println("Ingrese su nota en la materia de sociales");
            String soc = leer.nextLine();
            
            try {
                valor1 = Double.parseDouble(mat);
                valor2 = Double.parseDouble(soc);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            
            
            
            Asignacion asig = new Asignacion(lista, notas_matematicas, notas_sociales);
            System.out.println(asig);
            
        }
    }
    
}
