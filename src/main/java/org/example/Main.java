package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int secretNum = (int) (Math.random()*100)+1;
        int attempts = 0;
        int num;
        System.out.println("Adivine el numero entre: 1 Y 100");
        while(true){
            System.out.print("Numero: ");
            try {
                num = Integer.parseInt(read.nextLine());
                if(num==secretNum){
                    attempts++;
                    System.out.println("¡¡ADIVINASTE!! El numero secreto era: " + secretNum +
                            ". Cantidad de intentos: " + attempts);
                    break;
                } else if (num>secretNum) {
                    System.out.println("El numero secreto es mas chico.");
                    attempts++;
                } else{
                    System.out.println("El numero secreto es mas grande");
                    attempts++;
                }
            }catch (NumberFormatException e){
                System.out.println("Ingrese un numero entero entre 1 y 100.");
                attempts++;
            }
        }
        double n;
        int posicion;
        String cadena ;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        System.out.println("Contenido del array antes de modificar:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        try {
            System.out.print("\n\nIntroduce la posición del array a modificar: ");
            cadena = read.nextLine();
            posicion = Integer.parseInt(cadena);
            System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
            n = read.nextDouble();
            valores[posicion] = n;
            System.out.println("\nPosición a modificar " + posicion);
            System.out.println("Nuevo valor: " + n);
            System.out.println("Contenido del array modificado:");
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error en la posicion indicada: "+ e);
        }catch (InputMismatchException e){
            System.out.println("Error. Tipo de dato ingresado no valido: " + e);
        }
        double base;
        double height;
        System.out.println("Ingrese los datos del triangulo: ");
        while (true) {
            try {
                System.out.print("Base: ");
                base = Double.parseDouble(read.nextLine());
                System.out.print("Altura: ");
                height = Double.parseDouble(read.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
            }
        }
        System.out.println("El area es: " + ((base * height) / 2));
    }
    }