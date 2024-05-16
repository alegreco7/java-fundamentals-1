/*Snack 5
Data una base (intera) e un esponente (intero positivo) calcolare la potenza
*/

package org.lessons.java;
import java.util.Scanner;
public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente di inserire la base
        System.out.println("Inserisci la base:");
        int base = scanner.nextInt();

        // Chiediamo all'utente di inserire l'esponente
        System.out.println("Inserisci l'esponente (deve essere un intero positivo):");
        int exponent = scanner.nextInt();

        // Controlliamo se l'esponente è un intero positivo
        if (exponent < 0) {
            System.out.println("L'esponente deve essere un intero positivo.");
            return;
        }

        // Inizializziamo la variabile per memorizzare il risultato
        int risultato = 1;

        // Calcoliamo la potenza utilizzando un ciclo
        for (int i = 0; i < exponent; i++) {
            risultato *= base;
        }

        // Stampiamo il risultato
        System.out.println(base + " elevato alla " + exponent + " è uguale a " + risultato);
    }
}
