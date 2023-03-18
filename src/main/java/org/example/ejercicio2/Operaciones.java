package org.example.ejercicio2;

import org.example.exceptions.DesbordaCapacidadException;

public class Operaciones {int res;
    long num1_long;
    long num2_long;
    long res_long;

    public int sumar(int num1, int num2) throws DesbordaCapacidadException {
        res = num1 + num2;
        num1_long = (long) num1;
        num2_long = (long) num2;
        res_long = num1_long + num2_long;
        if ((long) res == res_long) {
            return res;
        } else {
            throw new DesbordaCapacidadException("El resultado desborda la capacidad de esta calculadora");
        }
    }

    public int restar(int num1, int num2) throws DesbordaCapacidadException {
        res = num1 - num2;
        num1_long = (long) num1;
        num2_long = (long) num2;
        res_long = num1_long - num2_long;
        if ((long) res == res_long) {
            return res;
        } else {
            throw new DesbordaCapacidadException("El resultado desborda la capacidad de esta calculadora");
        }
    }

    public int multiplicar(int num1, int num2) throws DesbordaCapacidadException {
        res = num1 * num2;
        num1_long = (long) num1;
        num2_long = (long) num2;
        res_long = num1_long * num2_long;
        System.out.println(res);
        System.out.println(res_long);
        if ((long) res == res_long) {
            return res;
        } else {
            throw new DesbordaCapacidadException("El resultado desborda la capacidad de esta calculadora");
        }
    }
}
