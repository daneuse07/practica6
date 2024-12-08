package practica8;

import java.util.Scanner;

public class Practica8 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        double total=0;
        int i;
        for(i=1; i<=8; i++){
            System.out.println("Ingrese la calificacion "+i);
            double c=scanner.nextDouble();
            total+=c;
        }

        double promedio=total/8;
        System.out.println("El promedio de las 8 calificaciones es: "+promedio);
    }
   
}
// Autor: Andrea García Espinoza
// Este programa solicita al usuario que ingrese 8 calificaciones, una por una.
// Utiliza la clase Scanner para leer las calificaciones ingresadas por el usuario,
// calcula el promedio de las 8 calificaciones sumando todas las entradas
// y dividiendo entre 8. Al final muestra el resultado del promedio en pantalla.