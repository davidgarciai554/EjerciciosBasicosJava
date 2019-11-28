/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicojava;

/**
 *
 * @author usuario
 */
public class EjerciciosBasicoJava {
    public boolean fiestaArdillas(int bellotas,boolean finDeSemana){
        if(bellotas>=40&&bellotas<=60||finDeSemana){
            return true;
        }
        return false;  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicoJava ejercicio =new EjerciciosBasicoJava();
        System.out.println(ejercicio.fiestaArdillas(30,false));
        System.out.println(ejercicio.fiestaArdillas(50,false));
        System.out.println(ejercicio.fiestaArdillas(50,true));
    }
    
}
