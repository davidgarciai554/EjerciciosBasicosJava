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
    
    public int multa(int velocidad,boolean cumpleanos){
        if(cumpleanos==true){
            velocidad-=5;
        }
        if(velocidad<=60){
        return 0; 
        }
        if(60<velocidad && velocidad<=80){
        return 1;
        }
        return 2;
        
    }
    public boolean muyVanidoso(int multiplo){
        
        if(multiplo%11==0||(multiplo%11)-1==0){
            return true;
        }
        return false;
    }   
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
        
        EjerciciosBasicoJava ejercicio =new EjerciciosBasicoJava();
        //1ºEjercicio
        System.out.println(ejercicio.fiestaArdillas(30,false));
        System.out.println(ejercicio.fiestaArdillas(50,false));
        System.out.println(ejercicio.fiestaArdillas(50,true));
        //2ºEjercicio
        System.out.println(ejercicio.multa(60,false));
        System.out.println(ejercicio.multa(65,false));
        System.out.println(ejercicio.multa(65,true));
        //3ºEjercicio
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
        
        
        
        
    }
    
}

