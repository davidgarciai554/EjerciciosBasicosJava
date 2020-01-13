/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicojava;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class EjerciciosBasicoJava {

    public boolean fiestaArdillas(int bellotas, boolean finDeSemana) {
        if (bellotas >= 40 && bellotas <= 60 || finDeSemana) {
            return true;
        }
        return false;
    }

    public int multa(int velocidad, boolean cumpleanos) {
        if (cumpleanos == true) {
            velocidad -= 5;
        }
        if (velocidad <= 60) {
            return 0;
        }
        if (60 < velocidad && velocidad <= 80) {
            return 1;
        }
        return 2;

    }

    public boolean muyVanidoso(int multiplo) {

        if (multiplo % 11 == 0 || (multiplo % 11) - 1 == 0) {
            return true;
        }
        return false;
    }

    public boolean telefono(boolean mañana, boolean madre, boolean dormir) {
        if (dormir) {
            return false;
        }
        if ((!mañana) || (mañana && madre)) {
            return true;
        }
        return false;
    }

    public boolean menorPor10(int a, int b, int c) {
        if (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(c - b) >= 10) {
            return true;
        }
        return false;
    }

    public boolean digitoIgual(int a, int b) {
        if (a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b % 10 || a % 10 == b / 10) {
            return true;
        }
        return false;
    }

    public boolean multiplo35(int a) {
        if ((a % 3 == 0 && a % 5 == 0)) {
            return false;
        }
        if ((a % 3 == 0 || a % 5 == 0)) {
            return true;
        }

        return false;
    }

    public boolean menor20(int a) {
        while (a > 20) {
            a -= 20;
        }
        if (a + 2 == 20 || a + 1 == 20) {
            return true;
        }
        return false;
    }

    public int loteria(int a, int b, int c) {
        if (a == b && b == c && a == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (b == c) {
            return 1;
        }
        return 0;
    }

    public int da2(int a, int b, boolean dobles) {
        int resul = a + b;
        if (dobles && a == b) {
            resul++;
        }
        return resul;
    }
    //
    //
    //Ejercicios nivel 01
    //
    //
    int[] listaMax = {60, 10, 1, 150};

    public int[] maximos(int[] lista) {
        int max = 0, max2 = 0, posMax = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > max) {
                max = lista[i];
                posMax = i;
            }
        }
        lista[posMax] = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > max2) {
                max2 = lista[i];
            }
        }
        int[] maxs = {max, max2};
        return maxs;
    }

    public boolean Palindromo(String frase) {
        frase = frase.toUpperCase();
        String aux = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                aux = aux + frase.charAt(i);
            }
        }
        frase = aux;
        int i = 0;
        while (i < frase.length() / 2 && frase.charAt(i) == frase.charAt(frase.length() - (i + 1))) {
            i++;
        }
        if (i == frase.length() / 2) {
            return true;
        }
        return false;
    }

    public boolean Isograma(String frase) {
        frase = frase.toUpperCase();
        String aux = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                aux = aux + frase.charAt(i);
            }
        }
        frase = aux;
        int i = 0, a = 0;
        while (i < frase.length() && frase.charAt(i) != frase.charAt(frase.length() - (i + 1))) {
            while (a < frase.length() && frase.charAt(i) != frase.charAt(frase.length() - (a + 1))) {
                a++;
            }
            i++;
        }
        if (i == frase.length()) {
            return true;
        }
        return false;
    }

    public void imprimeMes(int a) {
        int dias = 1;
        int fila = 0;
        boolean columna1 = true;
        while (dias <=31) {
            fila = 0;
            while (fila < 7 && dias <= 31) {
                if (columna1) {
                    for (int k = 0; k < a; k++) {
                        System.out.print("XX ");
                        fila++;
                        columna1 = false;
                    }
                }
                if (dias < 10 && fila<7) {
                    System.out.print(dias + "  ");
                    fila++;
                    dias++;
                } 
                else{
                    System.out.print(dias + " ");
                    fila++;
                    dias++;
                }
            }
            if(dias<=31)System.out.println();   
        }
        for (int k = 0; k < 7-fila; k++) {
            System.out.print("XX ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EjerciciosBasicoJava ejercicio = new EjerciciosBasicoJava();
        //1ºEjercicio
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(50, true));
        //2ºEjercicio
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));
        //3ºEjercicio
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
        //4ºEjercicio
        System.out.println(ejercicio.telefono(false, false, false));
        System.out.println(ejercicio.telefono(false, false, true));
        System.out.println(ejercicio.telefono(true, false, false));
        //5ºEjercicio
        System.out.println(ejercicio.menorPor10(5, 7, 11));
        System.out.println(ejercicio.menorPor10(11, 7, 1));
        System.out.println(ejercicio.menorPor10(5, 7, 10));
        //6ºEjercicio
        System.out.println(ejercicio.digitoIgual(12, 23));
        System.out.println(ejercicio.digitoIgual(10, 47));
        System.out.println(ejercicio.digitoIgual(22, 72));
        //7ºEjercicio
        System.out.println(ejercicio.multiplo35(3));
        System.out.println(ejercicio.multiplo35(5));
        System.out.println(ejercicio.multiplo35(15));
        //8ºEjercicio
        System.out.println(ejercicio.menor20(18));
        System.out.println(ejercicio.menor20(59));
        System.out.println(ejercicio.menor20(80));
        //9ºEjercicio
        System.out.println(ejercicio.loteria(2, 2, 2));
        System.out.println(ejercicio.loteria(1, 2, 2));
        System.out.println(ejercicio.loteria(0, 0, 0));
        //10ºEjercicio
        System.out.println(ejercicio.da2(2, 3, true));
        System.out.println(ejercicio.da2(3, 3, false));
        System.out.println(ejercicio.da2(3, 3, true));
        System.out.println(ejercicio.da2(6, 6, true));
        //Maximos de un array
        System.out.println(Arrays.toString(ejercicio.maximos(ejercicio.listaMax)));
        //Palindromo
        if ((ejercicio.Palindromo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
        //Isograma
        if (ejercicio.Isograma("asdfa")) {
            System.out.println("Es isograma");
        } else {
            System.out.println("No es isograma");
        }
        ejercicio.imprimeMes(0);
    }
}
