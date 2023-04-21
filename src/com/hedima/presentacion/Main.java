package com.hedima.presentacion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Forma 1:

        //1.- Definimos array

        int[] numeros = new int[4];

        numeros[0] =5;
        numeros[1] =4;
        numeros[2] =3;
        numeros[3] =2;

        // 2.- la mostramos por pantalla
        System.out.println("Elemento de la primera celda es " + numeros[0]);
        System.out.println("Elemento de la segunda celda es " + numeros[1]);
        System.out.println("Elemento de la tercera celda es " + numeros[2]);
        System.out.println("Elemento de la cuarta celda es " + numeros[3]);

        //Forma 2:
        Scanner s1 = new Scanner(System.in);
        String[] elementos = new String[5];
        for (int i = 0; i < elementos.length; i++){
            System.out.println("Introduzca el elemento: " + (i+1));
            elementos[i] = s1.next();
        }
        System.out.println(Arrays.toString(elementos));
    }
}