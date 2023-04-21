package com.hedima.presentacion;

public class ArrayEnteros {
    public static void main(String[] args) {
        //Crear un bloque de código que lea las componentes de un array de enteros y me pinte cuales son pares,
        // cuales impares y cuales son múltiplos de tres.
        // Para este ejercicio utilizar un bucle que recorra el array y utilizar el operador %.

        int[]num={ 3,4,734,12,3,-56,2651,24};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]+" PAR");
            } else {
                System.out.println(num[i]+" IMPAR");
            }if (num[i] % 3 == 0) {
                System.out.println(num[i]+" MÚLTIPLO de 3");
            }
        }

    }
}
