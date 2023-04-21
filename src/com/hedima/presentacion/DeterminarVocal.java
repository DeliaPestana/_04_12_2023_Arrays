package com.hedima.presentacion;

import java.util.Arrays;

public class DeterminarVocal{
    public static void main(String[] args) {
        // EJERCICIO: Crear un bloque de código que pinte las vocales y solo las vocales que existen en un array de caracteres. El programa debe de ir comprobando, con un bucle, para determinar si cada carácter del array es o no una vocal.

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'd', 'e', 'u'};
        for(int i = 0; i < array.length; i++){
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u'){
                System.out.println("Vocal encontrada en array " + array[i]);
            }
        }

        // Otra forma, controlando las mayúsculas

        System.out.println("Controlando las mayúsculas");
        char[] lista = {'H','o','l','A','m','U','n','d','o'};

        for(int i=0; i<lista.length; i++){
            switch(Character.toUpperCase(lista[i])) {
                case 'A','E','I','O','U': System.out.println("Vocal "+lista[i]+" posicion "+i);
            };

        }
        System.out.println(Arrays.toString(lista));
    }


}

