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
public class excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int res=0;
        int denominador;
        do{
            System.out.println("Ingrese el numerador: ");
            int numerador = entrada.nextInt();
            System.out.println("Ingrese el denominador: ");
            denominador = entrada.nextInt();
            
            try {
                res=numerador/denominador;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            
            System.err.println("Respuesta: "+res);
        }while(denominador==0);
        
    }
    
}
