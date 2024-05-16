/*Snack1
Crea un programma che, data la lunghezza di tre segmenti (di lunghezza non negativa), restituisca vero se è possibile costruirci un triangolo, altrimenti falso.
la proprietà fondamentale dei lati di un triangolo dice che: “In un triangolo ogni lato è minore della somma degli altri due”
*/

package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la lunghezza del primo segmento:");
        double segmento1 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del secondo segmento:");
        double segmento2 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del terzo segmento:");
        double segmento3 = scanner.nextDouble();

        boolean Triangolo = (segmento1 + segmento2 > segmento3) &&
                (segmento2 + segmento3 > segmento1) &&
                (segmento1 + segmento3 > segmento2);

        if (Triangolo) {
            System.out.println("È possibile costruire un triangolo con le lunghezze fornite.");
        } else {
            System.out.println("Non è possibile costruire un triangolo con le lunghezze fornite.");
        }
    }
}
