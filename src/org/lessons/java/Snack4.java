/*Snack4
La distanza di Hamming tra due stringhe di uguale lunghezza è il numero di posizioni nelle quali i caratteri corrispondenti sono diversi.
Crea un programma che, date due stringhe, ritorni la distanza di Hamming.
*/

package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prima stringa:");
        String stringa1 = scanner.nextLine();

        System.out.println("Seconda stringa:");
        String stringa2 = scanner.nextLine();

        if (stringa1.length() != stringa2.length()) {
            System.out.println("Le stringhe devono avere la stessa lunghezza.");
            return;
        }

        int distance = 0;

        for (int i = 0; i < stringa1.length(); i++) {
            if (stringa1.charAt(i) != stringa2.charAt(i)) {
                distance++;
            }
        }

        System.out.println("La distanza di Hamming tra \"" + stringa1 + "\" e \"" + stringa2 + "\" è: " + distance);
    }
}

