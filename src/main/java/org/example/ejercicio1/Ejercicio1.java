package org.example.ejercicio1;


import java.util.Scanner;

public class Ejercicio1 {
    double numero;
    double resultado;
    Scanner sc = new Scanner(System.in);

    public void Ejercicio1metodo() throws Exception {
        System.out.print("Introduce un valor: ");
        numero = sc.nextDouble();
        if (numero >=0) {
            resultado = raizCuadrada(numero);
        }else{
            throw new Exception();
        }
        resultado = Math.round(resultado *100.0)/100.0;
        System.out.println("La raíz cuadrada de " + numero + " es " + resultado);
    }

    private double raizCuadrada(double x) {

        return Math.sqrt(x);
    }
}
