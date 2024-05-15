package org.lessons.java;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        String[] invitati = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        // Supponiamo che 'nome' sia il nome inserito dall'utente e 'invitati' sia l'array contenente i nomi degli invitati
        boolean presenteTraInvitati = false;

        for (String invitato : invitati) {
            if (invitato.equals(nome)) {
                presenteTraInvitati = true;
                break; // Esci dal ciclo se il nome è stato trovato
            }
        }

        if (presenteTraInvitati) {
            System.out.println("Benvenuto al Met Gala!");
        } else {
            System.out.println("Mi dispiace, il tuo nome non è sulla lista degli invitati.");
        }

    }
}
