package com.hedima.presentacion;

public class OrdenInversoArray {
    public static void main(String[] args) {

        //EJERCICIO: Crear un bucle que pinte por consola todos los componentes de un array en orden inverso a como están guardados en el array

        int[] numeros = {1,2,3,4,5,6,7,8};
        for (int i = numeros.length-1;  i >= 0;  i--){
            System.out.println(numeros[i]);
        }
    }
}
