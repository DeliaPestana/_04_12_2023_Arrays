package com.hedima.presentacion;

public class ObtenerMayor {
    public static void main(String[] args) {

        // Declarar un array con 5 posiciones y asignarle valor a cada uno
        //Recorrer el array para obtener el número mayor de todo el array

        // 1.- Inicializamos el Array

        int[] numeros = {5,2,3,8,10}; // no hace falta poner el new porque lo esto inicializando
        /*
         Me ahorro el poner:
          int[] numeros = new int[4];

             numeros[0] =5;
             numeros[1] =2;
             numeros[2] =3;
             numeros[3] =8;
             numeros[3] =10;
         */
        //  int maximo = numeros[0]; // se puede sustituir por la línea siguiente, es opcional
        int maximo = Integer.MIN_VALUE; // Me define el valor mínimo posible

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maximo){
                maximo = numeros[i];
            }
        }
        System.out.println("El número máximo es " + maximo);
    }
}
