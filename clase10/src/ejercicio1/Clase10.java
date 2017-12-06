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
public class Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        
        entrada.nextLine();
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        
        
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su edad es: "+edad);
    }
    
}
