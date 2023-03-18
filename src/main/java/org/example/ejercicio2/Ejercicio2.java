package org.example.ejercicio2;


import org.example.exceptions.DesbordaCapacidadException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 extends Operaciones{
    Scanner sc = new Scanner(System.in);
    String opcion;
    int num1 = 0;
    int num2 = 0;
    int res;

    public void Ejercicio2metodo(){
        System.out.println("Introducir un número entero:");
        try {
            while(num1 == 0){
                num1 = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Debe ser un entero entre -2.147.483.648 y 2.147.483.647");
        }

        sc.nextLine();
        System.out.println("Introducir un operador, (+ - * / %) o s para salir: ");
        opcion = sc.nextLine();
        switch (opcion) {
            case "+":
                try {
                    System.out.println("Introducir un número entero:");
                    num2 = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Debe ser un entero entre -2.147.483.648 y 2.147.483.647");
                    break;
                }
                sc.nextLine();
                try {
                    res = sumar(num1, num2);
                    System.out.println("El resultado es: "+res);
                } catch (DesbordaCapacidadException e) {
                    System.out.println("El resultado desborda la capacidad de esta calculadora");
                }
                break;
            case "-":
                System.out.println("Introducir un número entero:");
                try {
                    num2 = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Debe ser un entero entre -2.147.483.648 y 2.147.483.647");
                }
                sc.nextLine();
                try {
                    res = restar(num1, num2);
                    System.out.println("El resultado es: "+res);
                } catch (DesbordaCapacidadException e) {
                    System.out.println("El resultado desborda la capacidad de esta calculadora");
                }
                break;
            case "*":
                System.out.println("Introducir un número entero:");
                try {
                    num2 = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Debe ser un entero entre -2.147.483.648 y 2.147.483.647");
                }
                sc.nextLine();
                try {
                    res = multiplicar(num1, num2);
                    System.out.println("El resultado es: "+res);
                } catch (DesbordaCapacidadException e) {
                    System.out.println("El resultado desborda la capacidad de esta calculadora");
                }
                break;
            case "/":
                System.out.println("Introducir un número entero:");
                try {
                    num2 = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Debe ser un entero entre -2.147.483.648 y 2.147.483.647");
                }
                sc.nextLine();
                res = num1 / num2;
                System.out.println("El resultado es: "+res);
                break;
            case "%":
                System.out.println("Introducir un número entero:");
                try {
                    num2 = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Debe ser un entero entre -2.147.483.648 y 2.147.483.647");
                }
                sc.nextLine();
                res = num1 % num2;
                System.out.println("El resultado es: "+res);
                break;
            default:
                System.out.println("Eso no es un símbolo esperado");
                break;
        }
    }
}
