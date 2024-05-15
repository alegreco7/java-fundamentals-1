package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Richiedi il numero di chilometri
        System.out.print("Inserisci il numero di chilometri da percorrere: ");
        int km = scanner.nextInt();

        // Richiedi l'età del passeggero
        System.out.print("Inserisci l'età del passeggero: ");
        int eta = scanner.nextInt();

        // Calcola il prezzo del biglietto
        double prezzo = km * 0.21; // prezzo base per km

        // Applica gli sconti in base all'età
        if (eta < 18) {
            // Sconto del 20% per i minorenni
            prezzo -= prezzo * 0.20;
        } else if (eta >= 65) {
            // Sconto del 40% per gli over 65
            prezzo -= prezzo * 0.40;
        }

        // Stampare il prezzo totale del viaggio
        System.out.println("Il prezzo totale del viaggio è: " + prezzo + " euro");

        // Chiudi lo scanner
        scanner.close();
    }
}

