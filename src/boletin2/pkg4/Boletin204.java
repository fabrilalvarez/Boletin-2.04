/* Diseña un programa que lea dos numeros y calcule su suma, resta división y multiplicación */
package boletin2.pkg4;

import java.util.Scanner;

public class Boletin204 {

    public static void main(String[] args) {
        // Codigo de la aplicación.
        float a, b, s, r, m, d;
        //s=suma r=resta m=multiplicación d=división.
        System.out.println("Inserte dos números");
        System.out.println("A= ");
        Scanner dato = new Scanner(System.in);
        a = dato.nextFloat();
        System.out.println("B= ");
        b = dato.nextFloat();

        s = a + b;
        r = a - b;
        m = a * b;
        d = a / b;

        System.out.println("Suma= " + s);
        System.out.println("Resta= " + r);
        System.out.println("Multiplicación= " + m);
        System.out.println("División= " + d);
    }

}
