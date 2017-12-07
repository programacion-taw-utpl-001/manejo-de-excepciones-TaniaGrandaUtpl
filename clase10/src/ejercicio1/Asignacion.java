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
public class Asignacion {
    //Atributos de la clase
    Estudiante [] lista_alumnos;
    double [] notas_matematicas;
    double [] notas_sociales;

    //Metodos get y set
    public Estudiante[] getLista_alumnos() {
        return lista_alumnos;
    }

    public void setLista_persona(Estudiante[] lista_alumnos) {
        this.lista_alumnos = lista_alumnos;
    }

    public double[] getNotas_matematicas() {
        return notas_matematicas;
    }

    public void setNotas_matematicas(double[] notas_matematicas) {
        this.notas_matematicas = notas_matematicas;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }

    public void setNotas_sociales(double[] notas_sociales) {
        this.notas_sociales = notas_sociales;
    }
    
    //Constructor con 3 parametros
    public Asignacion(Estudiante[] lista_alumnos, double[] notas_matematicas, double[] notas_sociales) {
        this.lista_alumnos = lista_alumnos;
        this.notas_matematicas = notas_matematicas;
        this.notas_sociales = notas_sociales;
    }
    
    
    public double matematicas_promedio_general(){
        double prom=0;
        for(int i = 0; i < notas_matematicas.length; i++){
            prom += notas_matematicas[i];//Vamos sumando nota por nota del arreglo notas_matematicas
        }
        prom =  prom / notas_matematicas.length;
        return prom;
    }
    
    public double sociales_promedio_general(){
        double prom=0;
        for(int i = 0; i < notas_sociales.length; i++){
            prom += notas_sociales[i];//va sumando nota por nota del arreglo notas_sociales
        }
        prom =  prom / notas_sociales.length;
        return prom;
    }
    
    double promedio[];
    public double[] promedio_por_alumno(){
        this.promedio = new double [4];
        for (int i = 0; i < promedio.length; i++) {
            //llamamos a los atributos notas matematicas y sociales para realizar el promedio
            this.promedio[i] = (this.notas_matematicas[i] + this.notas_sociales[i]) / 2;
        }
        return promedio;
    }
    
    // Metodo toString
    public String cadena_1(){
        String cadena = "";
        for (int i = 0; i < lista_alumnos.length; i++) {
            cadena +=  String.format("%s\n"
                    + "\tMatematicas: %.1f\n"
                    + "\tSociales: %.1f\n"
                    + "\tPromedio: %.1f\n\n", 
                    getLista_alumnos()[i], 
                    getNotas_matematicas()[i], 
                    getNotas_sociales()[i], 
                    promedio_por_alumno()[i]);
        }
        return cadena;
    }
    
    //Sobrescribimos el metodo toString
    @Override
    public String toString() {
        return String.format("\n Reporte Final\n"
                + "Lista Estudiantes\n"
                + "%s\n"
                + "Promedios generales\n\n"
                + "Promedios de Matematicas: %.1f\n"
                + "Promedios de Sociales: %.1f\n", cadena_1(), 
                matematicas_promedio_general(), sociales_promedio_general());
    }
}
