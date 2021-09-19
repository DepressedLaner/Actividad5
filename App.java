package Calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double a, b;

        Scanner Scan = new Scanner(System.in);

        System.out.print("Ingresa primer valor");
        a = Scan.nextDouble();
    System.out.print("Ingresa segundo valor");
        b = Scan.nextDouble();   



        System.out.println("\nProcesando");
        System.out.println("\nSus resultados:");


        System.out.println("\nSuma: " + (a + b));

        System.out.println("\nResta: " + (a - b));

        System.out.println("\nMultiplicación: " + (a * b));

        System.out.println("\nDivisión: " + (a / b));

        System.out.println("\nMódulo: " + (a % b));



    }
}
