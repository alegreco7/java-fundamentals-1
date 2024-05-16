/*Snack 2
Stampa il cubo dei primi N numeri, dove N è un numero indicato dall’utente.
Il numero N deve essere compreso tra 1 e 20: continuare a chiedere N all’utente finché non fornisce un numero valido.
*/

package org.lessons.java;

import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        while (true) {
            System.out.println("Inserisci un numero compreso tra 1 e 20:");
            N = scanner.nextInt();

            if (N >= 1 && N <= 20) {
                break;
            } else {
                System.out.println("Il numero inserito non è compreso tra 1 e 20. Riprova.");
            }
        }

        System.out.println("I cubi dei primi " + N + " numeri sono:");
        for (int i = 1; i <= N; i++) {
            int cubo = i * i * i;
            System.out.println("Il cubo di " + i + " è: " + cubo);
        }
    }
}
