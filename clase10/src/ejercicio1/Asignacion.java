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
public class Asignacion {
    Estudiante [] lista_persona;
    double [] notas_matematicas;
    double [] notas_sociales;

    public Estudiante[] getLista_persona() {
        return lista_persona;
    }

    public void setLista_persona(Estudiante[] lista_persona) {
        this.lista_persona = lista_persona;
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

    public Asignacion(Estudiante[] lista_persona, double[] notas_matematicas, double[] notas_sociales) {
        this.lista_persona = lista_persona;
        this.notas_matematicas = notas_matematicas;
        this.notas_sociales = notas_sociales;
    }

    public Asignacion() {
    }
    
    public void lista(){
        String lista="";
        for (int i = 0; i < 4; i++) {
            lista = lista_persona[i].toString()+notas_matematicas[i]+notas_sociales[i];
        }
     
    }
    
    public double promedio_por_estudiante(){
        double prom=0, suma=0;
        double n, n2;
        for (int i = 0; i < 4; i++) {
            n = notas_matematicas[i];
            n2 = notas_sociales[i];
            suma=n+n2;
        }
        prom=suma/2;
        return prom;
    }
    
    public void promedio_general_por_materia(){
        double sumaM=0, promM=0, promE=0, sumaE=0;
        for (int i = 0; i < notas_matematicas.length; i++) {
            sumaM = sumaM+notas_matematicas[i];
        }
        promM = sumaM/4;
        for (int i = 0; i < notas_sociales.length; i++) {
            sumaE = sumaE+notas_sociales[i];
        }
        promE = sumaE/4;
        System.out.println("Promedio Matematicas: "+promM);
        System.out.println("Promedio Sociales: "+promE);
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "Matemáticas: %s\n"
                + "Sociales: %s\n",getLista_persona(),getNotas_matematicas(), getNotas_sociales(),promedio_por_estudiante());
        return cadena;
    }
    
    
    
}
