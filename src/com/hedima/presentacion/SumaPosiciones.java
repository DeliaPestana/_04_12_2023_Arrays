package com.hedima.presentacion;

public class SumaPosiciones {
    public static void main(String[] args) {
        // Definir un array de floats asignando valores, como resultado
        // hay que obtener la suma de los valores almacenados en el array

        float[] numeros = {1.0f, 2.0f,3.0f,4.0f,5.0f};
        float suma  = 0.0f;

        for(int i=0; i<numeros.length; i++){
            suma += numeros[i];
        }
        System.out.println("la suma es: " + suma);
    }
}
